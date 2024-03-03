<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${fail}</h1>
	<form action="verify_otp">
		Enter Your OTP:<br>
		<input type="text" name="otp">
		<br><br>
		<input type="submit" value="Verify OTP">
	</form>
</body>
</html>