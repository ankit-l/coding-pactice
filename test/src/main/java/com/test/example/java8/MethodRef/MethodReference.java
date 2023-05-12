package com.test.example.java8.MethodRef;



public class MethodReference implements Sayable {

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}  
	
	
	   public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  

	 public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = MethodReference::saySomething;  
	        // Calling interface method  
	        sayable.say();  
	    }


}
