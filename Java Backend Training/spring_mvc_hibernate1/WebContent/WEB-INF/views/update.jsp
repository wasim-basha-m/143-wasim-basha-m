<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>
<title>Update</title>
</head>
<body>

	<h3>Update User</h3>
	${uList}
	<form method="POST" action="/spring_mvc_hibernate1/update/${id}">
		<table cellpadding="2" cellspacing="2">
		
			<tr>ID: <input type="hidden" name="id" disabled value="${id}"></tr>
			<tr>
				<td>NAME :<input type="text" name="Name" value="${Name}"></td>
			</tr>
			<tr>
				<td>AGE :<input type="text" name="Age" value="${Age}"></td>
			</tr>
			<tr>
				<td>EMAIL :<input type="text" name="Email" value="${Email}"></td>
			</tr>
			<tr>
				<td>ADDRESS :<input type="text" name="Address" value="${Address}"></td>
			</tr>			
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>

</body>
</html>