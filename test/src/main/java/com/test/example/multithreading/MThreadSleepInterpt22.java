package com.test.example.multithreading;

public class MThreadSleepInterpt22 extends Thread{
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy Thread" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("thraed interpted--");
		}
	}

}
