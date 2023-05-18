package com.test.example.multithreading;

public class ThreadJoin20 {
public static void main(String[] args) throws InterruptedException {
	
	MythredJoin19.mt= Thread.currentThread();// main thread 
	
	//Thread.currentThread().join(); dead lock situation accure with call main thread 
	MythredJoin19 t= new MythredJoin19();
	t.start();
	
	//t.join();//dead lock situation accure with call main thread and child thread with join method
	
	for (int i = 0; i < 10; i++) {
		System.out.println("Main Thread--");
		Thread.sleep(10000);
	}
}
}
