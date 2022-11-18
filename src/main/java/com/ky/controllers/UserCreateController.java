package com.ky.controllers;

import com.ky.dao.UserDAO;
import com.ky.models.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "UserCreateController", value = "/user-create")
public class UserCreateController extends HttpServlet {
    String username,email,password,picture;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("users/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        // Check that we have a file upload request
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (isMultipart) {
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();

            // Configure a repository (to ensure a secure temp location is used)
            ServletContext servletContext = this.getServletConfig().getServletContext();
            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);

            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

            // Parse the request
            try {
                List<FileItem> items = upload.parseRequest(request);

                // Process the uploaded items
                Iterator<FileItem> iter = items.iterator();
                while (iter.hasNext()) {
                    FileItem item = iter.next();

                    if (item.isFormField()) {
                        // processFormField(item);
                        if(item.getFieldName().equals("username")){
                            username=item.getString();
                        }
                        if(item.getFieldName().equals("password")){
                            password=item.getString();
                        }
                        if(item.getFieldName().equals("email")){
                            email=item.getString();
                        }
                    } else {
                        String contextPath=getServletContext().getRealPath("/uploads");
                        processUploadedFile(item,contextPath);
                        //response.sendRedirect("upload");
                    }

                }

            } catch (FileUploadException e) {
                e.printStackTrace();
            }
        } else {
            pw.print("reqest is regular");
        }
        User user=new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setPicture(picture);
        UserDAO.addUser(user);
        response.sendRedirect("users");
    }

    private void processUploadedFile(FileItem item,String contextPath) {
        String fileName = item.getName();
        File path = new File(contextPath);
        if (!path.exists()) {
            path.mkdirs();
        }
        File uploadedFile = new File(path + "/" + fileName);
        try {
            item.write(uploadedFile);
            picture=fileName;
            System.out.println("File Uploaded to :" + uploadedFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


