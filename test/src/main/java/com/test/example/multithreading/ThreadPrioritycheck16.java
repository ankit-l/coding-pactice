package com.test.example.multithreading;

public class ThreadPrioritycheck16 {
	public static void main(String[] args) {
		
		MyThreadPriority15 t = new MyThreadPriority15();
		t.setPriority(10); 
		/*  case_1:
		 * if comment then both main and child thread have same priority 5 hence we cant
		 * expect excution other and exact output
		 */
		
		/*case_2:
		 * if not comment then  main priority 5 and child thread  10  hence child thread child thread run 1st
		 */
		
		
		t.start();
		
		for (int i = 0; i <10; i++) {
			System.out.println("Main Thread---");
			
		}
		
		/** Note: Same Platform own't provide proper Support for Thread priority */
			}

}
