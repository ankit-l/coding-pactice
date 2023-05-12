package com.test.example.comp;

import java.util.Arrays;

public class ArraySample {
	
	public static void main(String[] args) {
		int [] arras= {5,4,2,1};
		Arrays.sort(arras);
		System.err.println(Arrays.toString(arras));
		
		
		EmployeeDemo [] emparr = new EmployeeDemo[4];
		emparr[0]=new EmployeeDemo(5,"Joun");
		emparr[1]=new EmployeeDemo(4,"Ankit");
		emparr[2]=new EmployeeDemo(2,"paul");
		emparr[3]=new EmployeeDemo(1,"amey");
		
		Arrays.sort(emparr);
		System.err.println("---compararble  object sort compararble---"+Arrays.toString(emparr));
		
		
		Arrays.sort(emparr,EmployeeDemo.comparator);
		System.err.println("--Comparator object sort---"+Arrays.toString(emparr));
	}


}
