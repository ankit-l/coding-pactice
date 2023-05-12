package com.test.example.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

import javax.persistence.criteria.CriteriaBuilder.In;

public class BiPredicateAndBiFunctionEx {

	public static void main(String[] args) {
		
		
		BiPredicate<Integer, Integer> checkSumOfTWo= (a,b)->(a+b)>=5;
		System.err.println("sum of 5 and 5 greter than 5 -- "+checkSumOfTWo.test(5, 5));
		
		System.err.println("sum of 1 and 5 greter than 5 -- "+checkSumOfTWo.test(1, 2));
		
		BiFunction<Integer, Integer, Integer> multiplyBoth= (a,b) -> (a*b);
		
		System.err.println("multiply of number two -- "+multiplyBoth.apply(2, 5));
		
		
	}
}
