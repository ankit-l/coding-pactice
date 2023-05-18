package com.test.example.multithreading;

public class MyThreadPriority15 extends Thread
{
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.err.println("Child Thread---");
		}
	}

}
