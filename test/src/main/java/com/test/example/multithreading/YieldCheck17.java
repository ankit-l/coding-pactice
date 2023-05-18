package com.test.example.multithreading;

public class YieldCheck17 {
	public static void main(String[] args) {
		MyThreadYeild17 t= new MyThreadYeild17();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thred ");// give chance to main thread completing 1st High
			
		}
	}

}
