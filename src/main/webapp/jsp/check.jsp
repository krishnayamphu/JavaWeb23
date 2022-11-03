<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");

    if(username.equals("admin")&& password.equals("a123")){

        response.sendRedirect("welcome.jsp");
    }else {
        response.sendRedirect("login.jsp?err");
    }
%>