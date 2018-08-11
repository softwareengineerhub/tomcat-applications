package org.app.AccessDBServlet;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;

@WebServlet(name = "AccessDBServlet", urlPatterns = "/AccessDBServlet")
public class AccessDBServlet extends HttpServlet {
    @Resource(name="myDS2")
    private DataSource ds;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(Connection c = ds.getConnection()){
            Writer w = resp.getWriter();
            w.append("Connection="+c);

            w.append("<br>User="+req.getRemoteUser());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
