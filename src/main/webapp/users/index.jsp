<%@ page import="com.ky.models.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<h4>All Users</h4>
<table border="1px">
    <tr>
        <th>Username</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<User> users= (ArrayList<User>) request.getAttribute("users");
        for(User user:users){
    %>
        <tr>
            <td><%= user.getUsername() %></td>
            <td><%= user.getEmail() %></td>
            <td> <button>Edit</button>
            <button>Delete</button></td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
