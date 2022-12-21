package com.patient;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MedicineDBUtil {
	
	private static boolean isSuccess = false;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs;

	
	
	public static boolean instertMedicine(String username ,String age,String drug,String address) {
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into medicine values(0,'"+username+"','"+age+"','"+drug+"','"+address+"')";
			int rs = stmt.executeUpdate(sql);
			
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
		

}
