package com.ky.events;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletRequstEvent", value = "/ServletRequstEvent")
@WebListener
public class ServletRequstEventDemo extends HttpServlet implements ServletRequestListener{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.getWriter().print("Hello Servlet Listener");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Servlet request made successfully. ");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

    }
}
