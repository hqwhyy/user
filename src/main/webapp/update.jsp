<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<form action="update.html" method="post">
    <input type="hidden" name="id" value="${teacher.id}">
    姓名：<input name="name"  value="${teacher.name}"/><br/>
    email:<input name="email" value="${teacher.email}"/><br/>
    密码：<input name="password" type="password"/><br/>
    电话：<input name="phone" value="${teacher.phone}"/><br/>
    <input type="submit" value="修改"/>
</form>
</body>
</html>
