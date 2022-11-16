<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload File</title>
</head>
<body>
<form method="POST" enctype="multipart/form-data" action="upload">
    File to upload: <input type="file" name="upfile">
    <br/>
    <br/>
    <button type="submit">Upload</button>
</form>
</body>
</html>
