<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Createiq Employees Update Form</h1>
  <form action="./update" method="post">
   <table style="with: 80%">
    <tr>
     <td>Emp ID</td>
     <td><input type="text" name="id" value="${e.id}" readonly="readonly" /></td>
    </tr>
    <tr>
     <td>Emp Name</td>
     <td><input type="text" name="name" value="${e.name}" /></td>
    </tr>
    <tr>
     <td>Emp Designation</td>
     <td><input type="text" name="des" value="${e.des}"/></td>
    </tr>
    <tr>
     <td>Emp salary</td>
     <td><input type="text" name="salary" value="${e.salary}"/></td>
    </tr>
   </table>
   <input type="submit" value="update" />
  </form>
 </div>
</body>
</html>