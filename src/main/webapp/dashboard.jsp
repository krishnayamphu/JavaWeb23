
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
<form action="logout" method="post">
    <button type="submit">Log out</button>
</form>
<h1>Welcome to dashboard</h1>
<p><%= session.getAttribute("user")%></p>
</body>
</html>
