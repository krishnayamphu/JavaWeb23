<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New User</title>
</head>
<body>
<h3>New User Details</h3>
<a href="users">Users</a>
<hr>
<form action="user-create" method="post" enctype="multipart/form-data">
    <input type="text" name="username" placeholder="username" required>
    <br><br>
    <input type="email" name="email" placeholder="email" required>
    <br><br>
    <input type="password" name="password" placeholder="password" required>
    <br><br>
    <input type="file" name="profile">
    <br><br>
    <button>Create</button>
</form>
</body>
</html>
