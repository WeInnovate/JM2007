package com.jm2007.learn.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter({ "/LoginFilter1", "/login" })
public class LoginFilter1 implements Filter {

	public LoginFilter1() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// preprocessing
		System.out.println("LoginFilter1 preprocessing....");
		String userName = request.getParameter("un");

		// pass the request along the filter chain

		if (!isBloackedUser(userName)) {
			if(isAdmin(userName)) {
				RequestDispatcher rd = request.getRequestDispatcher("adminlogin");
				rd.forward(request, response);
			}
			else {
				chain.doFilter(request, response);
			}
			
		}
			

		// postprocessing
		System.out.println("LoginFilter1 postprocessing....");
		if (isBloackedUser(userName)) {
			response.setContentType("text/HTML");
			PrintWriter out = response.getWriter();
			out.println("You have been bloacked, please try after some time!");
			out.print("<br /><a href=\"index.html\">Go to Home</a>");
		}
	}

	private boolean isBloackedUser(String userName) {
		return userName.equalsIgnoreCase("atul@atul.com") ? true : false;
	}
	
	private boolean isAdmin(String userName) {
		return userName.equalsIgnoreCase("admin@admin.com") ? true : false;
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
