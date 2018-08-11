package com.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/SimpleServlet",  urlPatterns = "/SimpleServlet")
public class SimpleServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw  = resp.getWriter();
        String html = "<html><body>" +
                "<table>" +
                "<tr>" +
                "<td>%s</td>" +
                "<td>%s</td>" +
                "</tr>" +
                "<tr>" +
                "<td>%s</td>" +
                "<td>%s</td>" +
                "</tr>" +
                "</table></body></html>";
        String res=String.format(html, "A","B","C","D");
        pw.append(res);
    }

}
