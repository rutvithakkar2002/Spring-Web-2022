<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h2>Calculator</h2>
<form action="saveresult" method="post">

	No1:<input type="text" name="a"><br><br>
	No2:<input type="text" name="b"><br><br>
	
	Choice:<select name="operation">
	
		<option value="add">Addition</option>
		<option value="sub">Subtraction</option>
		<option value="mul">Multiplication</option>
		<option value="div">Division</option>
	</select>
	<br><br><br>
	<input type="submit" name="Add">

</form>
</body>
</html>