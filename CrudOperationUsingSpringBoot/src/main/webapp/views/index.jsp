<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Working with JSP</title>
</head>
<body>
	<h2>Index....Page...</h2>
	<h3>${msg}</h3>
	<table class="table table-striped">
		<thead>
			<tr>
				<h3>
				<th><a href="registration">Register Student</a></th>
				<th><a href="updatePage">Update Student</a></th>
				<th><a href="deletePage">Delete Student</a></th>
				<th><a href="findPage">Find Student</a></th>
				<th><a href="findAllPage">FindAll Student</a></th>
			</tr>
			<tr>
				<th>Id</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Salary</th>
				<th>Experience</th>
			</tr>
			<c:forEach items="${employee}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.firstName}</td>
					<td>${item.lastName}</td>
					<td>${item.salary}</td>
					<td>${item.experience}</td>
					<td><a href="delete?id=${ item.id}">Delete</a></td>
					<td><a href="updatePage">update</a></td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>
