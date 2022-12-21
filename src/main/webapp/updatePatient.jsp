<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String id =request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	
	
	%>
		
	<form action="update" method ="post">
		Patient iD <input type ="text" name ="patid" value ="<%=id %>"readonly><br>
		Patient Name<input type ="text" name ="name" value ="<%=name %>"><br>
		Patient Email<input type ="email" name ="email" value ="<%=email %>"><br>
	    Patient Phone<input type ="text" name ="phone" value ="<%=phone %>"><br>
	    Patient Username<input type ="text" name ="username" value ="<%=username %>"><br>
	    Patient Password<input type ="text" name ="password" value ="<%=password %>"><br>
	    
	    
	    <input type = "Submit"name="submit"value="update">
	</form>

</body>
</html>