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
		<table>
	<c:forEach var="patient" items="${patientDetails}">
	
	<c:set var="id" value="${patient.id}"/>
	<c:set var="name" value="${patient.name}"/>
	<c:set var="email" value="${patient.email}"/>
	<c:set var="phone" value="${patient.phone}"/>
	<c:set var="username" value="${patient.userName}"/>
	<c:set var="password" value="${patient.password}"/>
	
	<tr>
		<td>patient ID</td>
		<td>${patient.id}</td>
	</tr>
	<tr>
		<td>patient Name</td>
		<td>${patient.name}</td>
	</tr>
	<tr>
		<td>patient Email</td>
		<td>${patient.email}</td>
	</tr>
	<tr>
		<td>patient Phone</td>
		<td>${patient.phone}</td>
	</tr>
	<tr>
		<td>patient User Name</td>
		<td>${patient.userName}</td>
	</tr>

	</c:forEach>
	</table>
	<c:url value="updatePatient.jsp" var ="patientUpdate">
		<c:param name="id" value ="${id}"/>
		<c:param name="name" value ="${name}"/>
		<c:param name="email" value ="${email}"/>
		<c:param name="phone" value ="${phone}"/>
		<c:param name="username" value ="${username}"/>
		<c:param name="password" value ="${password}"/>
	</c:url>
	<a href="${patientUpdate}">
	<input type="button" name="update"value="update account">
	</a>	
	
	<c:url value ="deletePatient.jsp" var="patientdelete">
	<c:param name="id" value = "${id}"></c:param>
	<c:param name="name" value = "${name}"></c:param>
	<c:param name="email" value = "${email}"></c:param>
	<c:param name="phone" value = "${phone}"></c:param>
	<c:param name="username" value = "${username}"></c:param>
	<c:param name="password" value = "${password}"></c:param>
	</c:url>
	<a href="${patientdelete}">
	<input type ="button" name="delete"value="delete account">
	</a>

	
	<form action ="logout" method ="get">
	<input type ="button" name="delete"value="log out">
	</form>
	
</body>
</html>