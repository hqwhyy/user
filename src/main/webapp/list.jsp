 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <script type="text/javascript" src="jquery-1.10.2.min.js"></script>
</head>
<body>
    <form action="list.html" method="post" id="searchForm">
        <input type="hidden" name="pageNum" id="pn">
        姓名：<input name="name" value="${param.name}">
        电话：<input name="phone" value="${param.phone}">
        <input type="submit" value="查询">
    </form>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>电话</td>
            <td>邮箱</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${requestScope.pageInfo.list}" var="t">
            <tr>
                <td>${t.id}</td>
                <td>${t.name}</td>
                <td>${t.phone}</td>
                <td>${t.email}</td>
                <td><a href="go_update.html?id=${t.id}">修改</a><a href="delete.html?id=${t.id}">删除</a> </td>
            </tr>
        </c:forEach>
    </table>
    <a href="javascript:void(0)" onclick="changePage(1)">首页</a>
    <a href="javascript:void(0)"  onclick="changePage(${requestScope.pageInfo.prePage})">上一页</a>
    <a href="javascript:void(0)"  onclick="changePage(${requestScope.pageInfo.nextPage})">下一页</a>
    <a href="javascript:void(0)"  onclick="changePage(${requestScope.pageInfo.pages})">末页</a>
<script type="text/javascript">
    function changePage(pn){
        $("#pn").val(pn);
        $("#searchForm").submit();
    }
</script>
</body>
</html>
