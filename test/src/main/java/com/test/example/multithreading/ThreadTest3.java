package com.test.example.multithreading;


public class ThreadTest3 {
	public static void main(String[] args) {
		
		// call the no arg method if overloading of run method
		ThreadNoArg t= new ThreadNoArg();
		t.start();
	}
	
	
}