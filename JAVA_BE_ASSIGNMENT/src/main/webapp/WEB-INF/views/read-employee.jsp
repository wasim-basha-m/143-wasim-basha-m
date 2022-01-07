<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>

	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>ID</th>
			<th>EMP ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>AGE</th>
			<th>AADHAR</th>
			<th>DEPARTMENT</th>			
			<th>UPDATE</th>			
			<th>DELETE</th>			
		</tr>
		
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.employeeId}</td>
				<td>${employee.employeeName}</td>
				<td>${employee.salary}</td>
				<td>${employee.age}</td>
				<td>${employee.aadhar}</td>
				<td>${employee.department}</td>
				<td><a href="update-employee/${employee.id}">Update</a></td>
				<td><a href="delete-employee/${employee.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/employees/create-employee">Create Employee</a>
	<a href="/employees/read-employee">Read Employees</a>
</body>
</html>