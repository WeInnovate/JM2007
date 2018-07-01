package com.jm2007.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		/*RequestDispatcher rd1 = request.getRequestDispatcher("header.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
		RequestDispatcher rd3 = request.getRequestDispatcher("footer.jsp");

		rd1.include(request, response);
		rd2.include(request, response);
		rd3.include(request, response);*/
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Inside LoginServlet.");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		if (userName.equals(password)) {
			request.setAttribute("msg", "Login success!!!");
			request.setAttribute("temp", "Remove this");
			RequestDispatcher rd = request.getRequestDispatcher("profile");
			rd.forward(request, response);
		} else {
			request.setAttribute("msg", "Login Failed!!!");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}

	}

}
