package com.test.example.java8;

import java.util.function.Predicate;

public class PredicatesEx {
	
	public static void main(String[] args) {
		PredicatesEx prEx= new PredicatesEx();
		System.err.println(prEx.testStringLenth("HiAmey"));
		
		Predicate<String> checkLenth= s-> s.length()>=5;
		System.out.println("check lenth using predicates--"+checkLenth.test("Hi"));
	}

	
	
	public boolean testStringLenth(String s) {
		
		if(s.length()>=5) 
			return true;
			
		else 
			return false;
			
	}
	
}
