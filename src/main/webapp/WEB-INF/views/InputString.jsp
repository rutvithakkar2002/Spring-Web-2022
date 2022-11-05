<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input String</title>
</head>
<body>
<form action="saveString" method="post">
Enter String 1:<input type="text" name="name1"><br><br>
Enter String 2:<input type="text" name="name2"><br><br>


<input type="submit" value="check">
${iserror}
</form>
</body>
</html>