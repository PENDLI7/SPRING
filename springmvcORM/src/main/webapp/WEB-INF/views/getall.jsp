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
<h1>CreateIq Employees List</h1>

<a href="./addemployee">AddEmployee</a><br></br> 
 
      <table border ="1" width="500" align="center">
         <tr bgcolor="00FF7F">
          <th><b>Emp ID</b></th>
          <th><b>Emp Name</b></th>
          <th><b>Emp Salary</b></th>
          <th><b>Action</b></th>
         </tr> 
       <c:forEach items="${map}" var="findAllemployees">
        <tr>
            <td>${findAllemployees.id}</td>
            <td>${findAllemployees.name}</td>
            <td>${findAllemployees.salary}</td>
             <td><a href="./remove?id=${findAllemployees.id}">delete</a>
             <a href="./find?id=${findAllemployees.id}" >updatebyId</a></td>     
             </tr>
    </c:forEach></table>
</body>
</html>