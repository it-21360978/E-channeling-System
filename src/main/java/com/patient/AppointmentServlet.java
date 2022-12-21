package com.patient;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppointmentServlet")
public class AppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String medcenter = request.getParameter("center");
		String Dname = request.getParameter("dname");
		String specs = request.getParameter("special");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		
		boolean isTrue;
		
		isTrue = appointmentDBUtil.AppointmentInsert(name, address, age, medcenter, Dname, specs, date, time);
		
			
		if(isTrue ==  true) {
			
			List<Appointment>appDetails = appointmentDBUtil.getAppointments();
			request.setAttribute("appDetails",appDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("MyAppointment.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request, response);
		}
		
		
		
	}

}
