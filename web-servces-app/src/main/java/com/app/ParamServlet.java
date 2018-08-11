package com.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ParamServlet", urlPatterns = "/ParamServlet")
public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*if(!req.getParameter("name").contains("A")) {
            doPost(req, resp);
        }*/
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        Helper helper = (Helper) req.getServletContext().getAttribute("helper");
        if(helper.isValid(name)) {
            int age = Integer.parseInt(req.getParameter("age"));
            resp.getWriter().append("name=" + name).append("age=" + age);
        }
        req.getServletContext().setAttribute("helper", "Test");
        req.getServletContext().removeAttribute("helper");
        req.getServletContext().setAttribute("helper", new Helper());
    }
}
