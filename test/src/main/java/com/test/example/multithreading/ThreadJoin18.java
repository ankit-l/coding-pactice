package com.test.example.multithreading;

public class ThreadJoin18 {
	public static void main(String[] args) throws InterruptedException {
		
		MythredJoin17 t= new MythredJoin17();
		t.start();
		t.join(10000);// give the chance the to call child thread  until the execution thread completion //t.join(1000),t.join(1000,100)
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thred- "+i);
			
		}
		
	}

}
