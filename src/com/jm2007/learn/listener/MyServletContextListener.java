package com.jm2007.learn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    public MyServletContextListener() {}

	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("contextDestroyed");
    }


    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("contextInitialized - "+sce.getServletContext().getInitParameter("institute"));
    	if(sce.getServletContext().getInitParameter("isDbCreationNeeded").equals("Yes")) {
    		System.out.println("Creating tables...");
    	}
    	else {
    		System.out.println("Db Creation not required.");
    	}
    }
	
}
