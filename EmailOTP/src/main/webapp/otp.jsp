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
<center>
	<form action="check">
		<c:if test="${wrong ne null}">
   			<h1>${wrong}</h1>
		</c:if>	
		Enter OTP:<input type="number" name="otp1"><br><br>
		<input type="submit" value="Enter">
	</form>
</center>
</body>
</html>