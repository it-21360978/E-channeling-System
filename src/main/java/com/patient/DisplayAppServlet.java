package com.patient;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/DisplayAppServlet")
public class DisplayAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Id = request.getParameter("id");
		
		
		boolean isTrue;
		isTrue = appointmentDBUtil.validate(Id);
		
		if(isTrue == true) {
			List<Appointment>appDetails = appointmentDBUtil.getappointment(Id);
			request.setAttribute("appDetails",appDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("MyAppointment.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis = request.getRequestDispatcher("BookAppointment.jsp");
			dis.forward(request, response);
			
		}
		
		
		
	}

}
