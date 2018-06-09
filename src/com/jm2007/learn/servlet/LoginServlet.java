package com.jm2007.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("un");
		String password = request.getParameter("pass");

		if (userName.equals(password)) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/HTML");
			out.println(userName + " login successful!");
			out.println("<br /> <a href=\"index.html\">Home</a>");
		}
		else {
			response.sendRedirect("login.html");
		}
		
	}

}
