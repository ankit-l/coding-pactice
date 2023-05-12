package com.test.example.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterEX {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(20);
		
		Stream a =list.stream().filter(x-> x%2==0);
		a.forEach(x-> System.out.println(x));
		

	}

}
