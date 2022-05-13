<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="delete" method="get">
<table>
<form:errors path="Employee.*" /> 
<tr><td>Id:</td><td><input type="number" name="id" placeholder="Enter Student Id"></td></tr>
<tr><td></td><td><input type="submit" value="submit"></td></tr>
<h3><a href="index">Home</a></h3>


</table>
</form>
</body>
</html>