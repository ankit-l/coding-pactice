package com.test.example.java8.stream;

import java.util.stream.Stream;

public class OfStreamEx {
	public static void main(String[] args) {
		Stream.of(1,11,22,33,4455,666,556).forEach(x-> System.out.println(x));
		
		String name []= {"Ankit","Amey","Amar","Ram"};
		Stream.of(name).filter(x->x.length()>=4).forEach(x-> System.out.println(x));
	}
}
