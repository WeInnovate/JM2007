package com.jm2007.learn.annotation.system;

public class App {
	@SuppressWarnings(value = {"deprecation", "xyz"})
	public static void main(String[] args) {
		FourWheeler fw = new FourWheeler();
		fw.start();
		fw.move();
		fw.stop();
	}
}
