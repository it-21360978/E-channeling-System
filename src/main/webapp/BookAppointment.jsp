<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="appointment" method="post" >
           
          
          
       <label for="name">Patient Name</label><br>
       <input type="text" id="pname" name="name" placeholder="Patient name.." required><br><br>

       <label for="padd">Patient Address</label><br>
       <input type="text" id="padd" name="address" placeholder="Patient Address.." required><br><br>
       
       <label for="age">Age</label><br>
       <input type="text" id="age" name="age" placeholder="Patient Age.."><br><br>
       
       <label for="dname">Doctor Name</label><br>
       <input type="text" id="dname" name="dname" placeholder="Doctor Name.." required><br><br>

      <label for="spec">Select Specialist</label><br>
      <select id="spec" name="special" required>
         <option value="Cardiologists">Cardiologists</option>
         <option value="Allergists">Allergists</option>
         <option value="Urologists">Urologists</option>
      </select><br><br>
      
      <label for="medi">Select Medical Center</label><br>
      <select id="medi" name="center" required>
         <option value="Asiri">Asiri</option>
         <option value="Nawaloka">Nawaloka</option>
         <option value="Durdans">Durdans</option>
      </select><br><br>
       
       <label for="bdate">Booking Date</label><br>
       <input type="date" id="bdate" name="date" placeholder="Year/Month/Day" required><br><br>
       
        <label for="btimee">Booking Time</label><br>
       <input type="time" id="btime" name="time" placeholder="Time A.M./P.M." value="6:00:00 A.M." required ><br><br>
       
    
     
    <input type="submit" id="sub1"  value="Make appointment" >    
  </form>

</body>
</html>