package xyz.app.MyAccount2Servlet;

import javax.annotation.Resource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "LoginFilterServlet", urlPatterns = "/LoginFilterServlet")
public class LoginFilterServlet extends HttpServlet {
    @Resource(name="myDS2")
    private DataSource ds;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login=req.getParameter("login");
        String password=req.getParameter("password");
        if(success(login, password)){
            HttpSession session = req.getSession(true);
            session.setAttribute("user", login);

            //req.login(login, password);
        }
        resp.sendRedirect("MyAccount2Servlet");
    }

    private boolean success(String login, String password){
        try(Connection c = ds.getConnection()){
            PreparedStatement ps = c.prepareStatement("SELECT count(*) FROM user_roles WHERE" +
                    " login=? and pass=?");
            ps.setObject(2, password);
            ps.setObject(1, login);

            ResultSet rs = ps.executeQuery();
            rs.next();
            return rs.getInt(1)==1;
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    private boolean success2(String login, String password){
        try {
            InitialContext context = new InitialContext();
            ds= (DataSource) context.lookup("myDS2");
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return true;
    }
}
