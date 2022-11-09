package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GetSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession(false);
        String username= (String) session.getAttribute("user");
        PrintWriter pw=response.getWriter();
        pw.print("Username: "+username);
    }
}
