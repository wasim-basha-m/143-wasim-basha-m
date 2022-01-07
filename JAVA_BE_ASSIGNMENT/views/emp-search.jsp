<%@ page language="java" contentType="text/html; charset=UTF-8"

	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="false"%>

<html>

<head>

<title>Home</title>

</head>

<body>

	<center> <h1>Employee Management System</h1> </center>

	<form action="search" method="POST">
	<table>
		<tr>
		<td>User Name :<input type="text" name="employeeName"></td>
		</tr>
		<tr>
		<td>Click to...<input	type="submit" value="search"></td>
		</tr>
	</table>
		</form>
	<a href="/employees/create-employee">Create Employee</a><br>
	<a href="/employees/read-employee">Read Employees</a>
</body>
</html>