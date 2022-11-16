<%@ page import="com.ky.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Details</title>
</head>
<body>
<h3>User Details</h3>
<a href="users">Users</a>
<a href="user-create">Create User</a>
<hr>
<% User user= (User) request.getAttribute("user"); %>
<form action="user-edit" method="post">
    <input type="hidden" name="id" value="<%= user.getId() %>">
    <input type="text" name="username" value="<%= user.getUsername() %>" placeholder="username" required>
    <br><br>
    <input type="email" name="email" value="<%= user.getEmail() %>" placeholder="email" required>
    <br><br>
    <input type="password" name="password" value="<%= user.getPassword() %>" placeholder="password" required>
    <br><br>
    <button>Update</button>
</form>
</body>
</html>
