package com.test.example.java8;

import java.util.function.Function;

public class FunctinalsDemo {

	
	public static void main(String[] args) {
		
		Function<Integer, Integer> Squrefun=i-> i*i;
		System.out.println("Squre use function----"+Squrefun.apply(5));
		
	}
}
