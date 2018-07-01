package com.jm2007.learn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jm2007.learn.model.User;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("registration.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("pass");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String gender = request.getParameter("gender");
		String[] courses = request.getParameterValues("courses");
		String batchSlot = request.getParameter("batchSlot");
		String comment = request.getParameter("comment");

		System.out.println(name + " " + password + " " + email + " " + mobile + " " + gender + " "
				+ batchSlot + " " + comment);
		for (int i = 0; i < courses.length; i++) {
			System.out.print(courses[i]+" ");
		}
		
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setMobile(mobile);
		user.setGender(gender);
		user.setCourses(courses);
		
		request.setAttribute("user", user);
		request.setAttribute("msg", "Registration Successfull!!!");
		request.getRequestDispatcher("profile.jsp").forward(request, response);
	}

}
