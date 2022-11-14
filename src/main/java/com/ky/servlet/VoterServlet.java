package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "VoterServlet", value = "/voter")
public class VoterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");
        String name=request.getParameter("name");
        int age =Integer.parseInt(request.getParameter("age"));

        pw.print("Voter name: "+name);
        pw.print("<br>");
        pw.print("Voter age: "+age);
    }
}
