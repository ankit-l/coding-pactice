package com.test.example.multithreading;

public class ThreadNameFind9 {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());// main
		
		MyThread7 t= new MyThread7();
		System.out.println(t.getName());// Thread-0
		
		Thread.currentThread().setName("AnkitLandge");
		System.out.println(Thread.currentThread().getName());// AnkitLandge
	}

}
