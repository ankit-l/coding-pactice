package com.test.example.multithreading;

public class MyThreadYeild17 extends Thread {
	public void run() {
		for (int i = 0; i <10; i++) {
			System.out.println("Child Thread Run");
			Thread.yield();
			
		}
		
	}

}
