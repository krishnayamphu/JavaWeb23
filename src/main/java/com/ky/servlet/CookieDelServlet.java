package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CookieDelServlet", value = "/cookie-del")
public class CookieDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        Cookie ck=new Cookie("user","");//deleting value of cookie
        ck.setMaxAge(0);//changing the maximum age to 0 seconds
        response.addCookie(ck);//adding cookie in the response

        pw.print("cookie deleted successfully");
    }
}
