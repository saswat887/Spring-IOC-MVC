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
<c:forEach var="i" items="1,5,10,true,false">
	${i}<br>
</c:forEach>
<c:forEach var="i" begin="1" end="10">
	${i}<br>
</c:forEach>
</body>
</html>