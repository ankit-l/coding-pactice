package com.test.example.multithreading;

public class MyThreadDemo6 {
	public static void main(String[] args) {
		MyRunnable5 r= new MyRunnable5();
		Thread t= new  Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread Runnable..");
			
		}
	}

}
