package com.test.example.executerFreamwork;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		//
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup g = new ThreadGroup("first thread");
		
		System.out.println(g.getParent().getName());
		
		ThreadGroup g1 = new ThreadGroup(g,"second thread");
		System.out.println(g1.getParent().getName());
	}
	

}
