package com.jm2007.learn.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {

	public MyRequestAttributeListener() {
	}

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("Removed: "+srae.getName()+ " "+srae.getValue().toString());
	}

	public void attributeAdded(ServletRequestAttributeEvent srae) {
//		System.out.println(srae.getSource().toString());
		System.out.println("Added: "+srae.getName()+ " "+srae.getValue().toString());
	}

	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("Replace: "+srae.getName()+ " "+srae.getValue().toString());
	}

}
