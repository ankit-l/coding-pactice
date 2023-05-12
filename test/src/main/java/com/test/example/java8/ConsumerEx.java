package com.test.example.java8;

import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {
		
		Consumer<Integer>squre=i-> System.out.println("print squre return nothing--- "+i*i);
		squre.accept(5);
		
	}

}
