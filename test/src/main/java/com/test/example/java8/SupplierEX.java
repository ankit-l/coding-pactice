/**
 * 
 */
package com.test.example.java8;

import java.util.Date;
import java.util.function.Supplier;

import org.hibernate.internal.build.AllowSysOut;

/**
 * @author Ankit
 *
 */
public class SupplierEX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> currentDate= () -> new Date();
		System.out.println("not take input return output-- "+currentDate.get());
		
		

	}

}
