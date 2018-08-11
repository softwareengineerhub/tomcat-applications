package org.app.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "MyAccountServlet", urlPatterns = "/MyAccountServlet")
//@HttpConstraint(rolesAllowed = {"app-admin"})
public class MyAccountServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //session.setAttribute("a", );
        resp.getWriter().append("Hello, "+req.getRemoteUser()+
                "; Session id = "+session.getId()+"   <a href='/LogoutServlet'/>");
    }
}
