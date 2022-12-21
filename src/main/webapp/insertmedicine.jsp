<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background: linear-gradient(45deg, greenyellow, dodgerblue);
  font-family: "Sansita Swashed", cursive;
}
.center {
  position: relative;
  padding: 75px 50px;
  background: #fff;
  border-radius: 10px;
}
.center h1 {
  font-size: 2em;
  font-family: "Times New Roman", Times, serif;
  border-left: 5px solid dodgerblue;
  padding: 10px;
  color: #000;
  letter-spacing: 5px;
  margin-bottom: 60px;
  font-weight: bold;
  padding-left: 10px;
}
.upd{
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
}
.upd:hover {
  background-color: #008CBA;
  color: white;
}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="MedicineServlet" method ="post">
			<div class="center">
              <h1>E-medi.lk</h1>
		 	User name<input type ="text" name="username"required>
			age<input type ="text" name="age"required>
			drug name <input type ="text" name="drug"required>
			address   <input type ="text" name="adres"required>
		<input type ="button" name ="submit" value="send"required class ="upd">
	
	
	
	</div>
	
	</form>



</body>
</html>