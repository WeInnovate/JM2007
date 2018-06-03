package com.jm2007.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello.........");
		
		PrintWriter out = response.getWriter();
		out.print("Hello There! "+sum(10, 20));
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("nm");
		String p = request.getParameter("pass");
		System.out.println("Hello.........");
		
		PrintWriter out = response.getWriter();
		out.print("Hello! "+name+" "+p);
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
}
