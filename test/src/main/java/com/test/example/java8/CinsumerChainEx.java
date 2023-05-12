/**
 * 
 */
package com.test.example.java8;

import java.util.function.Consumer;

/**
 * @author Ankit
 *
 */
public class CinsumerChainEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer>squreMe=i-> System.out.println("print squre return nothing--- "+i*i);
		squreMe.accept(5);
		
		Consumer<Integer> doubleMe =i-> System.out.println("print Double return nothing--- "+2*i);
		doubleMe.accept(5);
		
		squreMe.andThen(doubleMe).accept(5);
	}

}
