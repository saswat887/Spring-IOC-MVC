<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="submitform" modelAttribute="personObj">
		ENTER YOUR NAME:
		<form:input path="name"/>
		<br><br>
		ENTER YOUR AGE:
		<form:input path="age"/>
		<br><br>
		ENTER YOUR EMAIL:
		<form:input path="email"/>
		<br><br>
		ENTER YOUR PASSWORD:
		<form:input path="pwd"/>
		<br><br>
		<form:button>Submit</form:button>
	</form:form>
</body>
</html>