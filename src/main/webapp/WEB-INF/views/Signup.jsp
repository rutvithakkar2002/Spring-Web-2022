<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>

<style type="text/css">
.error {
	color: red;
}
</style>

</head>
<body>

	<h2>Signup</h2>
	<form action="saveuser" method="post" autocomplete="off">

		<input autocomplete="false" name="hidden" type="text"
			style="display: none;">FirstName:<input type="text"
			name="firstName" value="${user.firstName}" autocomplete="false" /><span
			class="error"> ${firstName}</span> <br> <br> Email:<input
			type="text" name="email" value="${user.email}" autocomplete="false" /><span
			class="error">${email }</span> <br> <br> password:<input
			type="password" name="password" value="${user.password}"
			autocomplete="false" /><span class="error">${password }</span> <br>
		<br> Gender : Male <input type="radio" name="gender" value="male" />
		Female<input type="radio" name="gender" value="female" /> <span
			class="error">${gender}</span> <br> <br> Hobby : Cricket <input
			type="checkbox" name="hobby" value="ckt" /> Instagram <input
			type="checkbox" name="hobby" value="ig" /> Twitter <input
			type="checkbox" name="hobby" value="twt" /> WhatsApp <input
			type="checkbox" name="hobby" value="wp" /> <span class="error">${hobby}</span>
		<br> <br> <input type="submit" value="signup">

	</form>

</body>
</html>