<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
<a href="http://localhost:8080/spring_mvc_hibernate1/search">Go to Search...</a><br>
<a href="http://localhost:8080/spring_mvc_hibernate1/">Add Another User...</a><br>
</head>
<body>

	<table border="1">
		<tr>
			<th>UserId </th>
			<th>NAME</th>
			<th>AGE</th>
			<th>EMAIL</th>
			<th>ADDRESS</th>
			<th>UPDATE</th>
			<th>DELETE</th>
			
		</tr>
		
		<c:forEach items="${uList}" var="users">
			<tr>
				<td>${users.id}</td>
				<td>${users.name}</td>
				<td>${users.age}</td>
				<td>${users.email}</td>
				<td>${users.address}</td>
				<td><a href="/spring_mvc_hibernate1/update/${users.id}">Update</a></td>
				<td><a href="/spring_mvc_hibernate1/delete/${users.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>