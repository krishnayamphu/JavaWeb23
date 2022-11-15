<%@ page import="com.ky.models.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<h4>All Users</h4>
<a href="user-create">Create New User</a>
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
            <td>
                <a href="user-edit?id=<%= user.getId() %>"><button>Edit</button></a>
                <form action="users" method="post">
                    <input type="hidden" name="id" value="<%= user.getId() %>">
                    <button>Delete</button>
                </form>
           </td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
