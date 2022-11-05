<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditUser</title>
</head>
<body>
	<form action="updateuser" method="post">
		<input type="hidden" name="userId" value="${user.userId}">

		FirstName:<input type="text" name="firstName"
			value="${user.firstName}" autocomplete="false" /><span class="error">
			${firstName}</span> <br> <br> Email:<input type="text"
			name="email" value="${user.email}" autocomplete="false" /><span
			class="error">${email }</span> <br> <br> Hobby : Cricket <input
			type="checkbox" name="hobby" value="ckt" /> Instagram <input
			type="checkbox" name="hobby" value="ig" /> Twitter <input
			type="checkbox" name="hobby" value="twt" /> WhatsApp <input
			type="checkbox" name="hobby" value="wp" /> <span class="error">${hobby}</span>
		<br> <br> <input type="submit" value="update user">
	</form>
</body>
</html>