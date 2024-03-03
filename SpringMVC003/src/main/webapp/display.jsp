<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Name:${name}</h1>
	<h1>Age:${age}</h1>
	<h1>Mobile:${mobile}</h1>
	<h1>Email:${email}</h1>
	<h1>Password:${password}</h1>
	
	<form action="logout">
		<input type="submit">
	</form>
	<a href="logout"><input type="submit" value="Log Out"></a>
</body>
</html>