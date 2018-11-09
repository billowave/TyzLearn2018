<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World</title>
</head>
<body>
	<h2>${area1str}</h2>

	<hr>


	<c:out value="${area1.area_name}"></c:out>
	<c:out value="${area1.area_owner}"></c:out>
	<c:out value="${area1.area_num}"></c:out>
	

	<hr>
	
	<%
		out.println(request.getAttribute("area1str"));
	%>

	<hr>
	
</body>
</html>