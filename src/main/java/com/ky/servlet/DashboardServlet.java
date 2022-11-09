package com.ky.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "DashboardServlet", value = "/dashboard")
public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        HttpSession session=request.getSession(false);
        if(session==null){
            pw.print("true");
            response.sendRedirect("login");
        }else{
          String user= (String) session.getAttribute("user");
          if(user==null){
              response.sendRedirect("login");
          }else{
              request.getRequestDispatcher("dashboard.jsp").forward(request,response);
          }
        }
    }
}
