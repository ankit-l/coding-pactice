package com.test.example.java8;

public class DefaultMethodInterfaceExDemo2  implements DefaultMethodInterfaceEx ,DefaultMethodInterfaceEx2{

	@Override
	public void testMeAb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PrintName() {
		// TODO Auto-generated method stub
		// solve Diamond Problem with use of interface.super.MethodName()
		DefaultMethodInterfaceEx2.super.PrintName();
	}
	
	public static void main(String[] args) {
		DefaultMethodInterfaceExDemo2 ab= new DefaultMethodInterfaceExDemo2();
		ab.PrintName();
	}
	

}
