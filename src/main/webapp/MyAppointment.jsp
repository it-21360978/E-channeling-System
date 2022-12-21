<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Appointment</title>
</head>
<body>
	<form action="display" method ="post">
		APPOINTMENT ID<input type="text" name="id" required>
		<input type="submit" value ="search">
	</form>

	<table>
		<c:forEach var ="app" items ="${appDetails}">
		
		<c:set var = "id"  value ="${app.id}"/>
		<c:set var = "name"  value ="${app.name}"/>
		<c:set var = "address"  value ="${app.address}"/>
		<c:set var = "age"  value ="${app.age}"/>
		<c:set var = "medic"  value ="${app.medcenter}"/>
		<c:set var = "dname"  value ="${app.dname}"/>
		<c:set var = "specs"  value ="${app.specs}"/>
		<c:set var = "adate"  value ="${app.appdate}"/>
		<c:set var = "atime"  value ="${app.apptime}"/>
		
		
		<tr>
		<td>patient ID</td>
		<td>${app.id}</td>
	</tr>
	<tr>
		<td>patient Name</td>
		<td>${app.name}</td>
	</tr>
	<tr>
		<td>patient Address</td>
		<td>${app.address}</td>
	</tr>
	<tr>
		<td>patient Age</td>
		<td>${app.age}</td>
	</tr>
 
 <tr>
		<td>Medical centere</td>
		<td>${app.medcenter}</td>
	</tr>
 
	<tr>
		<td>Doctor Name</td>
		<td>${app.dname}</td>
	</tr>
	<tr>
		<td>Specialization</td>
		<td>${app.specs}</td>
	</tr>
	<tr>
		<td>Appointment Date</td>
		<td>${app.appdate}</td>
	</tr>
	<tr>
		<td>Appointment Time</td>
		<td>${app.apptime}</td>
	</tr>
	
				
	</c:forEach>
	
</table>

	

	<c:url value ="UpdateAppointment.jsp" var ="appUpdate">
		<c:param name="id" value ="${id}"/>
		<c:param name="name" value ="${name}"/>
		<c:param name="address" value ="${address}"/>
		<c:param name="age" value ="${age}"/>
		<c:param name="medic" value ="${medic}"/>
		<c:param name="dname" value ="${dname}"/>
		<c:param name="spec" value ="${specs}"/>
		<c:param name="date" value ="${adate}"/>
		<c:param name="time" value ="${atime}"/>
		
		
	</c:url>



	<a href ="${appUpdate}">
	<input type ="button" name="update" value="update appointment">
	</a>
</body>
</html>