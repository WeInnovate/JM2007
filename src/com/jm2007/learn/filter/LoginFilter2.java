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

//@WebFilter({ "/LoginFilter2", "/login" })
public class LoginFilter2 implements Filter {

	public LoginFilter2() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// preprocessing
		System.out.println("LoginFilter2 preprocessing....");

		chain.doFilter(request, response);

		// postprocessing
		System.out.println("LoginFilter2 postprocessing....");

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
