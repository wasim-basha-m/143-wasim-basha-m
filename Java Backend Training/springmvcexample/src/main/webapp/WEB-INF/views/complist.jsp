<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Spring Handler</title>
</head>
<body>
           <h2>Company Information</h2>
           <form:form method = "POST" action = "/springmvcexample/Comp/addCompany" modelAttribute="company">
         <table>
          <tr>
               <td><form:label path = "id">Id</form:label></td>
               <td><form:input path = "id" /></td>
            </tr>
            <tr>
               <td><form:label path = "CompName">Company Name</form:label></td>
               <td><form:input path = "CompName" /></td>
            </tr>
            
           <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
     </body>
   </html>
