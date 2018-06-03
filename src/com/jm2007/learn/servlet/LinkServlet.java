package com.jm2007.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String page = "index.html";
		String requestedUrl = request.getRequestURI();
		if(requestedUrl.contains("contact-us")) {
			System.out.println("I'm here");
			page = "contact-us.html";
		}
		else if(requestedUrl.contains("about-us")) {
			page = "about-us.html";
		}		
		
		response.sendRedirect(page);
	}
	
}
