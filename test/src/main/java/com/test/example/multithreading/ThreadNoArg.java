package com.test.example.multithreading;

public class ThreadNoArg extends Thread {

	public void run() {

		System.out.println("run no- arg only");
	}

	public void run(int i) {

		System.out.println("run no- arg only");
	}
}
