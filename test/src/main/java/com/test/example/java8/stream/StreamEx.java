package com.test.example.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
	public static void main(String[] args) {
		
	List<Integer> list= new ArrayList<Integer>();
	list.add(1);
	list.add(5);
	list.add(10);
	
	
	List<Integer> newlist= new ArrayList<Integer>();
	
	newlist=list.stream().filter(x-> x>=5).collect(Collectors.toList());
	
	newlist.stream().forEach(x-> System.err.println(x));
	}

}
