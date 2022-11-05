<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Users</title>
</head>
<body>

	<table border="1">

		<tr>

			<td>UserId</td>
			<td>FirstName</td>
			<td>Email</td>
			<td>password</td>
			<td>Gender</td>
			<td>Hobby</td>
			<td>Action</td>

		</tr>

	<c:forEach items="${users}" var="u">
	
		<tr>
			<td>${u.userId}</td>
			<td>${u.firstName}</td>
			<td>${u.email}</td>
			<td>${u.password}</td>
			<td>${u.gender}</td>
			<td>${u.hobby}</td>
			
			<td><a href="deleteuser?userId=${u.userId}">Delete</a>|
				<a href="edituser?userId=${u.userId}">Edit</a>
				
			</td>
			
			<td><a href="deleteuser?userId=${u.userId}"></a></td>
		</tr>
	
	
	</c:forEach>
	</table>

</body>
</html>