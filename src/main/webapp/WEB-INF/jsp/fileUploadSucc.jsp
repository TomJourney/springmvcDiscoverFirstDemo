<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="java.util.List" import="java.util.ArrayList"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传成功</title>
</head>
<body>
  文件名：${fileName} <br/>
  文件路径：${path}
  <a href="fileUploadPage.do">再次上传</a>
</body>
</html>