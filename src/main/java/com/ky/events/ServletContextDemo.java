package com.ky.events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebListener
@WebServlet(name = "ServletContextDemo", value = "/ServletContextDemo")
public class ServletContextDemo extends HttpServlet implements ServletContextListener{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("application Context initialized successfully.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("application context destroyed successfully.");
    }
}
