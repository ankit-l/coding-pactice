package com.test.example.multithreading;

public class ThreadPriority14 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());// 5
		
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority()); // 7 // parent
		
		
		// Exception in thread "main" java.lang.IllegalArgumentException
		
		/** Thread.currentThread().setPriority(13);*/
		 
		MyThread13 t = new MyThread13();
		System.out.println(t.currentThread().getPriority());// 7 parent to child priority 
		
		
		t.currentThread().setPriority(8);// set Child priority
		System.out.println(t.currentThread().getPriority());
		
	}

}
