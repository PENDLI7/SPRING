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
  <form action="./updated" method="post">
   <table style="with: 80%">
    <tr>
     <td>Emp ID</td>
     <td><input type="text" name="id" value="${map.id}" readonly="readonly" /></td>
    </tr>
    <tr>
     <td>Emp Name</td>
     <td><input type="text" name="name" value="${map.name}" /></td>
    </tr>
    <tr>
     <td>Emp salary</td>
     <td><input type="text" name="salary" value="${map.salary}"/></td>
    </tr>
   </table>
   <input type="submit" value="update" />
  </form>
 </div>
</body>
</html>