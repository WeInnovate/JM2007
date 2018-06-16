package com.jm2007.learn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/JavaServlet", "/java" }, initParams = {
		@WebInitParam(name = "trainerName", value = "Atul"), @WebInitParam(name = "trainerMobile", value = "98765") })
public class JavaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JavaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String traineeName = request.getParameter("traineeName");

		ServletConfig config = getServletConfig();
		String trnName = config.getInitParameter("trainerName");
		String trnMob = config.getInitParameter("trainerMobile");

		ServletContext context = config.getServletContext();
		String institute = context.getInitParameter("institute");

		PrintWriter out = response.getWriter();
		out.println("Hello, " + traineeName);
		String trainerData = String.format("Your tainer is %s and his mobile number is %s in %s", trnName, trnMob,
				institute);
		out.println(trainerData);

	}

}
