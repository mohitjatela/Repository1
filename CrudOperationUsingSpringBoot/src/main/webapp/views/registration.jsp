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
<form action="form-handler" method="get">
<table>
<form:errors path="Employee.*" /> 
<tr><td>Id:</td><td><input type="number" name="id" placeholder="Enter Student Id"></td></tr>
<tr><td>FirstName:</td><td><input type="text" name="firstName" placeholder="Enter First Name"></td></tr>
<tr><td>LastName:</td><td><input type="text" name="lastName" placeholder="Enter Last Name"></td></tr>
<tr><td>Salary:</td><td><input type="text" name="salary" placeholder="Enter Salary"></td></tr>
<tr><td>Experience:</td><td><input type="text" name="experience" placeholder="Enter Experience"></td></tr>
<tr><td></td><td><input type="submit" value="submit"></td></tr>
<h3><a href="index">Home</a></h3>


</table>
</form>
</body>
</html>