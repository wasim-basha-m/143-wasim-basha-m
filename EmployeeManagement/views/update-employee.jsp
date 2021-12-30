<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Update Employee</h1>
<form:form method="post" action="${id}">
    <table>
		<tr>
            <td>ID: </td>
            <td><form:input type="text" path="employeeId" value="${employee.employeeId}"/></td>
        </tr>
		<tr>
            <td>NAME: </td>
            <td><form:input type="text" path="employeeName" value="${employee.employeeName}"/></td>
        </tr>
		<tr>
            <td>SALARY: </td>
            <td><form:input type="text" path="salary" value="${employee.salary}"/></td>
        </tr>
		<tr>
            <td>AGE: </td>
            <td><form:input type="text" path="age" value="${employee.age}"/></td>
        </tr>
		<tr>
            <td>AADHAR: </td>
            <td><form:input type="text" path="aadhar" value="${employee.aadhar}"/></td>
        </tr>
		<tr>
            <td>DEPARTMENT: </td>
            <td><form:input type="text" path="department" value="${employee.department}"/></td>
        </tr>
		 <tr>
            <td></td>
            <td><input type="submit" value="Update"/></td>
        </tr>
    </table>
    <a href="/employees/create-employee">Create Employee</a><br>
	<a href="/employees/read-employee">Read Employees</a>
</form:form>