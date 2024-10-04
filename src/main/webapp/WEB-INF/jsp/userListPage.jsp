<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="java.util.List" import="java.util.ArrayList"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
    <table border="1" cellpadding="0" cellspacing="0" bordercolor="#000000">
        <tr>
            <td>用户编号</td>
            <td>用户名称</td>
            <td>手机</td>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.mobilePhone}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>