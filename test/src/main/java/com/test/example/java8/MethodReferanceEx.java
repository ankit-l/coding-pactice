package com.test.example.java8;

public class MethodReferanceEx {
	
	public static void main(String[] args) {
		FunctinalInterfaceEx funIntEx= Test:: testImplementaion;
		funIntEx.singleAbtractmethod();
		
	}

}

class Test {
	
	public static void testImplementaion() {
		
		System.out.println("check Method Referance sample ");
	}
	
}
