package com.patient;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username,String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql ="select * from patient where username='"+username+"'and password='"+password+"'";
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
	public static List<patient>getPatient(String userName){
		
		ArrayList<patient>patient = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql ="select * from patient where username='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				patient pa1 = new patient(id,name,email,phone,username,password);
				
				patient.add(pa1);
			}
			
		}catch(Exception e) {
			
		}
		return patient;
	}
	
	public static boolean insertpatient(String name,String email,String phone,String username,String password) {

	boolean isSuccess = false;
	
	
	// create DataBase Connection
	
  	try {
		con = DBConnect.getConnection();
		stmt = con.createStatement();
	    String sql = "insert into patient values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			isSuccess = true;
		} else {
			isSuccess = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return isSuccess;
}
	
	public static boolean updatePatient(String id , String name, String email, String phone, String username,String password) {
		
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update patient set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'where id ='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				
				isSuccess= true;
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

	
	public static boolean deletePatient(String id) {
		
		int convId = Integer.parseInt(id);
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from patient where id ='"+convId+"'";
			
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				
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

