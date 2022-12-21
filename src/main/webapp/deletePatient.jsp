<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Delete Page</h1>
		<%
		String id =request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
	%>
		<form action="delete" method ="post">
		Patient iD <input type ="text" name ="patid" value ="<%=id %>"readonly><br>
		Patient Name<input type ="text" name ="name" value ="<%=name %>"readonly><br>
		Patient Email<input type ="email" name ="email" value ="<%=email %>"readonly><br>
	    Patient Phone<input type ="text" name ="phone" value ="<%=phone %>"readonly><br>
	    Patient Username<input type ="text" name ="username" value ="<%=username %>"readonly><br>

	    
	    
	    <input type = "Submit"name="delete"value="delete account">
	</form>

</body>
</html>