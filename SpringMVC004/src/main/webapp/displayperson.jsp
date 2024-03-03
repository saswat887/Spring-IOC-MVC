<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Name</th>
		<th>Age</th>
		<th>Email</th>
		<th>Password</th>
	</tr>
	<c:forEach var="p" items="${veiwList}">
		<tr>
			<td>${p.getName()}</td>
			<td>${p.getAge()}</td>
			<td>${p.getEmail()}</td>
			<td>${p.getPwd()}</td>
		</tr>
	
	</c:forEach>
</table>
</body>
</html>