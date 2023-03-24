<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Createiq Technologies Employee Registration Form</h1>
  <form action="./save" method="post" modelAttribute="e" >
   <table style="with: 80%">
    <tr>
     <td>Emp ID</td>
     <td><input type="text" path="id" /></td>
    </tr>
    
    <tr>
     <td>Emp Name</td>
     <td><input type="text" path="name"/></td>
    </tr>
    <tr>
     <td>Emp Role</td>
     <td><input type="text" path="des" /></td>
    </tr>
    <tr>
     <td>Emp salary</td>
     <td><input type="text" path="salary"/></td>
    </tr>
   </table>
   <input type="submit" value="Register" />
  </form>

 </div>
</body>
</html>