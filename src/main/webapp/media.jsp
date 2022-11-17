<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ky.utils.MediaFile" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            font-family: arial;
            margin:0;
            padding: 0;
            box-sizing: border-box;
        }
        .container{
            padding: 15px;
            display: flex;
            flex-wrap: wrap;
        }
        .card{
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            padding: 5px;
        }
        .card img{
            width: 150px;
            height: 150px;
            object-fit: cover;
        }
        .card img:hover{
            opacity: 0.8;
        }
        .img-action{
            width: 100%;
            padding: 5px;
            display: flex;
            justify-content: space-evenly;
        }

    </style>
</head>
<body>
<h3>All Files</h3>
<div class="container">
    <%
        ArrayList<String> files= (ArrayList<String>) request.getAttribute("files");
        for(String item:files){
    %>
    <div class="card">
        <img src="uploads/<%= item %>" alt="<%= item %>">
        <div class="img-action">
            <a href="uploads/<%= item %>">View</a>
            <form action="media" method="post">
                <input type="hidden" name="pic" value="<%= item %>">
                <button>Delete</button>
            </form>
        </div>
    </div>
    <%
        }
    %>
</div>
</body>
</html>
