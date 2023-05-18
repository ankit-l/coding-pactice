package com.test.example.multithreading;

public class ThreadInterpted25 {
	public static void main(String[] args) {
		MThreadSleepInterpt24 t= new MThreadSleepInterpt24();
		t.start();
		t.interrupt();//  if this line add to interpt child thread child thred work one time then iterpted ex showing and end execution child thred 
		System.out.println("Thread Of End..");
	}
}
