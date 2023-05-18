package com.test.example.multithreading;

public class MythredJoin19 extends Thread {
	static Thread mt;

	public void run() {

		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread" + i);

		}
	}
}