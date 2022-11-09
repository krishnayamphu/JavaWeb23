package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AuthServlet", value = "/auth")
public class AuthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(username.equals("admin") && password.equals("a123")){
            HttpSession session=request.getSession();
            session.setAttribute("user",username);
           response.sendRedirect("dashboard");
        }else{
            HttpSession session=request.getSession();
            session.setAttribute("err","Invalid");
            response.sendRedirect("login");
        }
    }
}
