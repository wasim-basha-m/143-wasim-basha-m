<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<table border="1">
		<tr>
			<th>ID</th>
			<th>EMP ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>AGE</th>
			<th>AADHAR</th>
			<th>DEPARTMENT</th>
			
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
			</tr>
		</c:forEach>
	</table>
	 <a href="/employees/create-employee">Create Employee</a><br>
	<a href="/employees/read-employee">Read Employees</a>
</body>
</html>