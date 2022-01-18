<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
.error{color:red}
</style>
</head>
<body>
<form action="com.howtodoinjava.hibernate.test.dto.Users" modelAttribute="users">
UserNme: <form input path="user_name"/> <br><br>
UserId: <form password path="user_id"/>  
<form errors path="pass" cssClass="error"/><br><br>
<input type="submit" value="submit">
</form>
</body>
</html>