package com.test.example.multithreading;

public class MThreadSleepInterpt24 extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("I am lazy Thread" + i);
		}
		System.out.println("enter into sleeping thread----");
		try {
			
				Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("thraed interpted--");
		}
	}

}
