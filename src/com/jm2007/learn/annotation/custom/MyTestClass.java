package com.jm2007.learn.annotation.custom;

public class MyTestClass {

	@Test(isEnabled=true)
	public void m1() {
		System.out.println("m1 is running...");
	}

	@Test(isEnabled=false)
	public void m2() {
		System.out.println("m2 is running...");
	}

	@Test
	public void m3() {
		System.out.println("m3 is running...");
	}

	public void m4() {
		System.out.println("m4 is running...");
	}
}
