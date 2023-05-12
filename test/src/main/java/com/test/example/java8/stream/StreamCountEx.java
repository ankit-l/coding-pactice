package com.test.example.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCountEx {
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(10);
		
		
		List<Integer> newlist= new ArrayList<Integer>();
		
		Stream<Integer> stramInt =list.stream().filter(x-> x>=5);
		long countno=  stramInt.count();
		System.out.println("CountNo---"+countno);
		
		
		long mewstramInt =list.stream().count();
		System.out.println("total count--- "+mewstramInt);
		
	}

}
