package com.patient;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeletePatientServlet")
public class DeletePatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("patid");
		
		boolean isTrue;
		
		isTrue = PatientDBUtil.deletePatient(id);
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("patientReg.jsp");
			dis.forward(request, response);
		}else {
			
		   List<patient> patientDetails = PatientDBUtil.getPatient(id);
			
			request.setAttribute("patientDetails", patientDetails);
			
			RequestDispatcher dis1 = request.getRequestDispatcher("userAccount.jsp");
			dis1.forward(request,response);
			
	}

}
}
