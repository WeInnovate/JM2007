package com.jm2007.learn.annotation.system;

public class FourWheeler extends Vehicle {

	@Override
	@Deprecated
	public void move() {
		System.out.println("moving with speed of 200KM/H");
	}
	
	public void moveFast() {
		System.out.println("moving with speed of 200KM/H");
	}

}
