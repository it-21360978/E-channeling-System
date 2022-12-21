<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="MedicineServlet" method ="post">
	
		 	User name<input type ="text" name="username"required>
			age<input type ="text" name="age"required>
			drug name <input type ="text" name="drug"required>
			address   <input type ="text" name="adres"required>
		<input type ="button" name ="submit" value="send"required>
	
	
	
	
	
	</form>

</body>
</html>