<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int getSquareValue(int n){
        return  n*n;
    }
%>

<p>Square value is: <%= getSquareValue(5) %>.</p>
</body>
</html>
