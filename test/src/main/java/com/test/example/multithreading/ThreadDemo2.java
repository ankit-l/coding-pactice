package com.test.example.multithreading;

public class ThreadDemo2 {
	
	public static void main(String[] args) {
		MyThread1 t= new MyThread1();
		t.start();
		//JVM is responsible for shedule the thread and their priority
		for (int i = 0; i < 10; i++) {
			System.out.println("mainThread");
			
		}
	}

}
