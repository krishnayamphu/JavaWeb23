<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="check.jsp" method="post">
    <p style="color:red">
    <%
        String msg=request.getParameter("err");
        if(msg!=null){
            out.print("Invalid username or password");
        }

    %>
    </p>
    <br>
    Username
    <br><br>
    <input type="text" name="username" required>
    <br><br>
    Password
    <br><br>
    <input type="password" name="password" required>
    <br><br>
    <button type="submit">Login</button>
</form>

</body>
</html>
