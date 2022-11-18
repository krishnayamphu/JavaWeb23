<%@ page import="com.ky.models.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/style.css">
    <title>Users</title>
</head>
<body>
<header>
    <h4>All Users</h4>
</header>
<nav>
    <a href="user-create">Create New User</a>
</nav>

<table class="tbl-users">
    <tr>
        <th>Username</th>
        <th>Email</th>
        <th>Picture</th>
        <th>Action</th>
    </tr>
    <%
        ArrayList<User> users= (ArrayList<User>) request.getAttribute("users");
        for(User user:users){
    %>
        <tr>
            <td><%= user.getUsername() %></td>
            <td><%= user.getEmail() %></td>
            <td><img src="uploads/<%= user.getPicture()%>" width="100px" alt=""></td>
            <td>
                <div class="action-group">
                    <a href="user-edit?id=<%= user.getId() %>">Edit</a>
                    <form class="form-action" action="users" method="post">
                        <input type="hidden" name="id" value="<%= user.getId() %>">
                        <button>Delete</button>
                    </form>
                </div>
           </td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
