package com.test.example.multithreading;

public class MythredJoin17 extends Thread {
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
