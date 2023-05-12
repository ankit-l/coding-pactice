package com.test.example.java8.mapFlatmap;

public class EqualHashcodeEx {
	
	public static void main(String[] args) {
		
		NewEmployee e1= new NewEmployee();
		e1.setId(1);
		e1.setName("Ankit");
		
		NewEmployee e2= new NewEmployee();
		e2.setId(1);
		e2.setName("Ankit");
		
		System.out.println("Shallow Compair "+(e1==e2));// false
		
		//after override .euals() then return true 
		
		System.out.println("Deep Compair "+(e1.equals(e2)));
		
		
		
	}

}
