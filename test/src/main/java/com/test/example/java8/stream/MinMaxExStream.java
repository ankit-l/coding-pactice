package com.test.example.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxExStream {
	
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(15);
		
		
		List<Integer> newlist= new ArrayList<Integer>();
		
		Stream<Integer> filterstramInt =list.stream().filter(i-> i>=5);
	
		
		Integer  minValue = filterstramInt.min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("min print filter with sorted--  "+minValue);
		/*
		 * Integer maxValue = filterstramInt.max((i1,i2)-> i2.compareTo(i1)).get();
		 * System.out.println("max print filter with sorted--  "+maxValue);
		 */
		
		System.out.println("new line print ----------------");
		
		Integer  minValueNfilter =list.stream().min((i1,i2)-> i1.compareTo(i2)).get();
	     System.out.println("print without filter with min value--  "+minValueNfilter);
	     
	     Integer  maxValueNfilter =list.stream().max((i1,i2)-> i1.compareTo(i2)).get();
	     System.out.println("print without filter with max value--  "+maxValueNfilter);
		
	}

}
