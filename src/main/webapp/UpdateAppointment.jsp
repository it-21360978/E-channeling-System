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
		String id = request.getParameter("id");
	    String pname = request.getParameter("name");
		String padd = request.getParameter("address");
		String age = request.getParameter("age");
		String medi = request.getParameter("medic");
		String dname = request.getParameter("dname");
		String speci = request.getParameter("spec");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		
	%>





	<form action="AppUpdateServlet" method ="post">
	
 <label for="name">Appointment ID</label><br>
 <input type="text" id="pname" name="id" value="<%=id%>"  readonly><br><br>
 
 <label for="name">Patient Name</label><br>
       <input type="text" id="pname" name="name" value="<%=pname%>" placeholder="Patient name.." required><br><br>

       <label for="padd">Patient Address</label><br>
       <input type="text" id="padd" name="address" value="<%=padd%>" placeholder="Patient Address.." required><br><br>
       
       <label for="age">Age</label><br>
       <input type="text" id="age" name="age" value="<%=age%>" placeholder="Patient Age.."><br><br>
       
       <label for="dname">Doctor Name</label><br>
       <input type="text" id="dname" name="dname" value="<%=dname%>" placeholder="Doctor Name.." required><br><br>

      <label for="spec">Select Specialist</label><br>
      <select id="spec" name="specs" value="<%=speci%>" required>
         <option value="Cardiologists">Cardiologists</option>
         <option value="Allergists">Allergists</option>
         <option value="Urologists">Urologists</option>
      </select><br><br>
      
      <label for="medi">Select Medical Center</label><br>
      <select id="medi" name="medcen" value = "<%= medi %>" required>
         <option value="Asiri">Asiri</option>
         <option value="Nawaloka">Nawaloka</option>
         <option value="Durdans">Durdans</option>
      </select><br><br>
       
       <label for="bdate">Booking Date</label><br>
       <input type="date" id="bdate" name="date" value="<%=date %>" placeholder="Year/Month/Day" required><br><br>
       
        <label for="btimee">Booking Time</label><br>
       <input type="time" id="btime" name="time" value="<%=time %>" placeholder="Time A.M./P.M." value="6:00:00 A.M." required ><br><br>
       
    
     
    <input type="submit" id="sub1"  value="update appointment" > 
	
	</form>

</body>
</html>