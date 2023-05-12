package com.test.example.multithreading;

public class RestartThread {
	public static void main(String[] args) {
		MyThread4 t= new MyThread4();
		t.start();
		System.out.println("main Method");
		// if restart same  thread getting Exception in thread "main" java.lang.IllegalThreadStateException 
		t.start();
	}

}
