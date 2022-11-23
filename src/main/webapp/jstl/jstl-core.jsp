<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:out value="Welcome to JSTL"/>
<c:set var="contact" scope="session" value="1234567"/>
<p>
    Contact Details:
    <br>
    Phone:<c:out value="${contact}"/>
</p>
<hr>

<c:set var="age" scope="session" value="19"/>
 <c:if test="${age>=18}">
     <p>You can vote</p>
 </c:if>

<hr>

<c:forEach var="i" begin="1" end="5">
    <c:out value="${i}"/>
    <br>
</c:forEach>

</body>
</html>
