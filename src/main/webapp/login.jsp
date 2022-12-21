<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIN Here!</title>
</head>
<body>
	<form action="LoginServlet" method ="post">
		Username<input type="text" name="username"placeholder="username" required>
		Password<input type="password" name="password"placeholder="password" required>
		
		<input type="submit" value ="login">
		
</form>

</body>
</html>