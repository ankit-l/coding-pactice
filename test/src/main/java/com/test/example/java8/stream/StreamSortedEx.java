package com.test.example.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortedEx {
	
	public static void main(String[] args) {

		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(10);
		list.add(15);
		
		
		List<Integer> newlist= new ArrayList<Integer>();
		
		Stream<Integer> filterstramInt =list.stream().filter(x-> x>=5);
		
		Stream<Integer> sorrtedstramInt = filterstramInt.sorted();
		sorrtedstramInt.forEach(x-> System.out.println("print filter with sorted--  "+x));
		
		Stream<Integer> allstramInt =list.stream().sorted();
		allstramInt.forEach(x-> System.out.println("print filter with sorted--  "+x));
		
	}

}
