package com.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "FileUploaderServlet", urlPatterns = "/FileUploaderServlet")
@MultipartConfig
public class FileUploaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Collection<Part> parts= req.getParts();
        for(Part part: parts){
            //part.getInputStream()
            System.out.println(part.getName());
        }
    }
}
