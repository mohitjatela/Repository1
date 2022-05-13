<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%=request.getAttribute("header")%></h1>
	<h2>Hello : ${user.id } , ${user.name }</h2>
	<h3>Row Added</h3>


</body>
</html>