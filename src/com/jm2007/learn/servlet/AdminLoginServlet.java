package com.jm2007.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/AdminLoginServlet", "/adminlogin" })
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminLoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.sendRedirect("login.html");
		RequestDispatcher rd1 = request.getRequestDispatcher("header.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		RequestDispatcher rd3 = request.getRequestDispatcher("footer.html");
		
		rd1.include(request, response);
		rd2.include(request, response);
		rd3.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
System.out.println("Inside AdminLoginServlet.");
		String userName = request.getParameter("un");
		String password = request.getParameter("pass");

		if (userName.equals(password)) {
//			PrintWriter out = response.getWriter();
//			response.setContentType("text/HTML");
//			out.println(userName + " login successful!");
//			out.println("<br /> <a href=\"index.html\">Home</a>");
			request.setAttribute("msg", "success");
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			rd.forward(request, response);
		}
		else {
//			response.sendRedirect("login.html");
			response.sendRedirect("http://www.google.co.in/");
		}
		
	}

}
