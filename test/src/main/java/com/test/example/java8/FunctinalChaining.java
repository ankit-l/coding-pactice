package com.test.example.java8;

import java.util.function.Function;

public class FunctinalChaining {
	public static void main(String[] args) {
		
		
		Function<Integer, Integer> doublefun=i-> 2*i;
		System.out.println("Double pring of value----"+doublefun.apply(2));
		
		
		Function<Integer, Integer> cubefun=i-> i*i*i;
		System.out.println("cube pring of value----"+cubefun.apply(2));
		
		
		System.out.println("first double pring of value----"+doublefun.andThen(cubefun).apply(2));
		
		System.out.println("first cube pring of value----"+doublefun.compose(cubefun).apply(2));
		
	}

}
