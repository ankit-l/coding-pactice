package com.test.example.multithreading;

public class Overridestart {
	public static void main(String[] args) {
		MyThread4 t= new MyThread4();
		t.start();
		System.out.println("main Method");
	}
	
}
