package com.test.example.java8;

import java.util.function.Predicate;

public class PredicateJoinEx {
	public static void main(String[] args) {
		
		Predicate<String> checkLenth= s-> s.length()>=5;
		System.out.println("check lenth using predicates--"+checkLenth.test("HiAmey"));
		
		
		Predicate<String> checkEvenLenth= s-> s.length()%2==0;
		System.out.println("check Even lenth using predicates--"+checkEvenLenth.test("HiAmey"));
		
		// it can join with And
		
		System.out.println("check lenth using predicates___AND--"+checkLenth.and(checkEvenLenth).test("HiAmeyN"));
		// it can join with OR
		
		System.out.println("check lenth using predicates ___OR--"+checkLenth.or(checkEvenLenth).test("HiAmeyN"));
		
		// it can join with negate
		System.out.println("check lenth using predicates___Negate--"+checkLenth.negate().test("Hi"));
		
		
		
	}
	

}
