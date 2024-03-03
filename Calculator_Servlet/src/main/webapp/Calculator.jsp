<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form >
		Enter first number:<input type="text" name="first"><br><br>
		Enter second number:<input type="text" name="second"><br><br>
		<input type="submit" value="Addition" onclick="form.action='add'">
		<input type="submit" value="Substraction" onclick="form.action='sub'">
		<input type="submit" value="Multiplication" onclick="form.action='mul'">
		<input type="submit" value="Division" onclick="form.action='div'">
	
	</form>
</body>
</html>