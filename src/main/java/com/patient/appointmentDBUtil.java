package com.patient;

import java.sql.Connection;



import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class appointmentDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static boolean isSuccess;
	private static ResultSet rs ;

	
	
	
	
public static boolean validate(String id) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql ="select * from appointment where id ='"+id+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
		
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return isSuccess;
	
}

public static List<Appointment>getappointment(String Id){
	
	ArrayList<Appointment> appointment= new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql ="select * from appointment where id='"+Id+"'";
		rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String  address = rs.getString(3);
			int age = rs.getInt(4);
			String medi = rs.getString(5);
			String dname = rs.getString(6);
			String specs = rs.getString(7);
			String date = rs.getString(8);
			String time = rs.getString(9);
			
			
			Appointment app = new Appointment(id,name,address,age,medi,dname,specs,date,time);
			
			appointment.add(app);
		}
		
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
	return appointment;
}
	
	
	// Insert to data 
	
	public static boolean AppointmentInsert(String name ,String address,String age,String center,String dname,String special,String date,String time) {
		
		
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into appointment values(0,'"+name+"','"+address+"','"+age+"','"+center+"','"+dname+"','"+special+"','"+date+"','"+time+"')";
		    int  rs = stmt.executeUpdate(sql);
			
		    if(rs > 0) {
				
				isSuccess = true;
			}
			else {
				
				isSuccess = false;
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
				
	}
	
public static List<Appointment> getAppointments(){
	
	ArrayList <Appointment> app = new ArrayList<>();
	
	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from appointment";
		rs = stmt.executeQuery(sql);
		
		
		while(rs.next()) {
			
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			int age = rs.getInt(4);
			String medi = rs.getString(5);
			String dname = rs.getString(6);
			String specs = rs.getString(7);
			String date = rs.getString(8);
			String time = rs.getString(9);
			
			Appointment ap = new Appointment(id,name,address,age,medi,dname,specs,date,time);
			
			app.add(ap);
		}
		
		
	}
	catch(Exception e) {
		
		e.printStackTrace();
		
	}
	
	return app;
		
}
	public static boolean updateAppointment(String id ,String name,String address,String age,String dname,String specs,String medi ,String date,String time) {
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update appointment set P_name='"+name+"', p_address='"+address+"', age='"+age+"', center='"+dname+"', d_name='"+specs+"', special='"+medi+"', A_date='"+date+"', A_time='"+time+"'where id ='"+id+"'";
			
			int r = stmt.executeUpdate(sql);
			
			if(r>0) {
				
				isSuccess = true;
				
			}else {
				
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
			
		
		return isSuccess;
	}	
	
}

			
	
		
		
		
		

	
	
	
	
	

