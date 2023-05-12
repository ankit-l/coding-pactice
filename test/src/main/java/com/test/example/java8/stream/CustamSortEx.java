package com.test.example.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustamSortEx {
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(15);
		
		
		List<Integer> newlist= new ArrayList<Integer>();
		
		Stream<Integer> filterstramInt =list.stream().filter(x-> x>=5);
		// decending order Print
		
		Stream<Integer> sorrtedstramInt = filterstramInt.sorted((i1,i2)-> i2.compareTo(i1));
		sorrtedstramInt.forEach(x-> System.out.println("Custam print filter with sorted--  "+x));
		
		System.out.println("new line print ----------------");
		
		Stream<Integer> allstramInt =list.stream().sorted((i1,i2)-> i2.compareTo(i1));
		allstramInt.forEach(x-> System.out.println("print filter with sorted--  "+x));
		
	}

}
