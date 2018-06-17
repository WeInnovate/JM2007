package com.jm2007.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/ProfileServlet", "/profile" })
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProfileServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.removeAttribute("temp");
		request.setAttribute("msg", "Login Success");
		String userName = request.getParameter("un");
		PrintWriter out = response.getWriter();
		response.setContentType("text/HTML");
		String msg = (String)request.getAttribute("msg");
		out.println(userName + " "+msg);
		out.println("<br /> <a href=\"index.html\">Home</a>");
	}

}
