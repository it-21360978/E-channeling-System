package com.patient;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
	
		
		
		boolean isTrue;
		
		isTrue = PatientDBUtil.validate(userName, password);
		
		if(isTrue == true) {
			
			List<patient>patientDetails = PatientDBUtil.getPatient(userName);
			request.setAttribute("patientDetails", patientDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("userAccount.jsp");
			dis.forward(request, response);
			HttpSession session = request.getSession();
			session.invalidate();
			out.print("<br>");
			out.print("You are successfully logged out");
			out.close();
			
			
		}else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Your username or password are incorrect');");
			out.println("location = 'login.jsp'");
			out.println("</script>");
		}
		
	}

}
