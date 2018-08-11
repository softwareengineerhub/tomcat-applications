package xyz.app.MyAccount2Servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;

@WebFilter(filterName = "FilterMySessionFilter", urlPatterns = "/MyAccount2Servlet")
public class FilterMySessionFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {

    }


    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //chain.doFilter(req, resp);
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(true);
        Object user = session.getAttribute("user");
        if(user!=null){
            chain.doFilter(req, resp);
        } else{
            HttpServletResponse response = (HttpServletResponse) resp;
            response.sendRedirect("fliter-login.html");
        }
    }


    public void destroy() {
    }



}
