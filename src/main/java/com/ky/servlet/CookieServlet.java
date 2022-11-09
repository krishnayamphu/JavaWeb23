package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieServlet", value = "/cookie-set")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie ck=new Cookie("user","Aptech");
        response.addCookie(ck);
        PrintWriter pw=response.getWriter();
        pw.print("cookie set successfully.");
    }
}
