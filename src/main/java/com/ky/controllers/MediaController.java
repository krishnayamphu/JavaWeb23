package com.ky.controllers;

import com.ky.utils.MediaFile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "MediaController", value = "/media")
public class MediaController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=getServletContext().getRealPath("/uploads");
        ArrayList<String> files= MediaFile.getFiles(path);
        request.setAttribute("files",files);
        request.getRequestDispatcher("media.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String picname=request.getParameter("pic");
        String path=getServletContext().getRealPath("/uploads");
        MediaFile.delete(path,picname);
        response.sendRedirect("media");
    }
}
