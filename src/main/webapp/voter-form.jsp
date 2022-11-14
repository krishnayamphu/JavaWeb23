<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Voter Form</title>
</head>
<body>
<h3>Voter Details</h3>
<form action="voter" method="post">
    Name: <br>
    <input type="text" name="name" required>
    <br><br>
    Age: <br>
    <input type="text" name="age" required>
    <br><br>
    <button type="submit">Submit</button>
</form>
</body>
</html>
