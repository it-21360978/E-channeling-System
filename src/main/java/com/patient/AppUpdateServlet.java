package com.patient;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AppUpdateServlet")
public class AppUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String dname = request.getParameter("dname");
		String specs = request.getParameter("specs");
		String medi = request.getParameter("medcen");
		String date = request.getParameter("date");
		String time = request.getParameter("time");
		
		
		boolean isTrue;
		isTrue = appointmentDBUtil.updateAppointment(id, name, address, age, dname, specs, medi, date, time);
		
		if(isTrue == true) {
			
			List<Appointment>appDetails = appointmentDBUtil.getappointment(id);
			request.setAttribute("appDetails",appDetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("MyAppointment.jsp");
			dis.forward(request, response);
		}
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
