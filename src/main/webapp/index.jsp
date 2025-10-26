<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
​
<h3>账号列表页面</h3>
<%--<a href="/account/findAll.do">查询所有</a>--%>
<a href="<c:url value='/account/findAll.do' />">查询所有账户</a>
​
<h3>测试新增</h3>
<form action="<c:url value='/account/save.do' />" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存" />
</form>
​
</body>
</html>
