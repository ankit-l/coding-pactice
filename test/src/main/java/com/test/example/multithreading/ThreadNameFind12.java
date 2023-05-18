package com.test.example.multithreading;

public class ThreadNameFind12 {
	public static void main(String[] args) {
		MyThread11 t= new MyThread11();
		t.start();
		System.out.println("main methode excecuted by Thread--- :   "+ Thread.currentThread().getName());// main 
				
	}

}
