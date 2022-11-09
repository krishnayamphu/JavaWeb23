<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
</head>
<body>

<form action="auth" method="post">
    <input type="text" name="username" placeholder="username" required>
    <br><br>
    <input type="password" name="password" placeholder="password" required>
    <br><br>
    <button type="submit">Login</button>
</form>
</body>
</html>
