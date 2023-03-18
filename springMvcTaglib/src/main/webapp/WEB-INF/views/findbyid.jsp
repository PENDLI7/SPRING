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
<form action="./find" method="post">

<label for="Id">ID:</label>
<input type="number" name="id" value="${e.id}"
readonly="readonly"><br><br>

<label for="Name">name:</label>
<input type="text" name="name" value="${e.name}"><br><br>

<label for="Desgination">salary:</label>
<input type="text" name="des" value="${e.des}"><br><br>


<label for="salary">salary:</label>
<input type="text" name="salary" value="${e.salary}"><br><br>


<input type="submit" value="update"><br><br>
</form>
</body>
</html>