package com.jm2007.learn.annotation.custom;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unchecked")
			Class<MyTestClass> myClass = (Class<MyTestClass>) Class
					.forName("com.jm2007.learn.annotation.custom.MyTestClass");
			Method[] methods = myClass.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i].getName());
				if (methods[i].isAnnotationPresent(Test.class)) {
					System.out.println("Annotation is present.");
					Test testAnnotation = methods[i].getDeclaredAnnotation(Test.class);
					if (testAnnotation.isEnabled()) {
						System.out.println("Annotation is enabled.");
						methods[i].invoke(myClass.newInstance());
					}
				}
			}
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| InstantiationException e) {
			e.printStackTrace();
		}
	}

}
