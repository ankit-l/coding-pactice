package com.test.example.multithreading;

public class MyThread11  extends Thread {
	
	public void run() {
		
		System.out.println("run Method excecuted by Thread--- :  "+ Thread.currentThread().getName());// thread0 means child thtread name
		
	}

}
