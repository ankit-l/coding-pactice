package com.test.example.multithreading;

public class MyThread4  extends Thread {

	public void start() {
//override start method is's working as normal method
		//if u added super.start the with run all method like it's working as thread
		super.start();
		System.out.println("start method");
	}

	public void run() {

		System.out.println("run Method");
	}
}

