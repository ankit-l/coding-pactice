package com.test.example.multithreading;

import java.util.HashSet;
import java.util.Set;

public class SAmTest {

	public static void main(String[] args) {
		String s="ank5i5t7tknk";
		
		char[] a =s.toCharArray();
		Set<Character> dup= new HashSet<Character>();
		Set<Character> Alphadup= new HashSet<Character>();
		for (int i = 0; i < a.length; i++) {
			if(Character.isDigit( s.charAt(i))){
				char b= s.charAt(i);
				dup.add(b);
				System.out.println();
			}
			if(Character.isAlphabetic( s.charAt(i))){
				char b= s.charAt(i);
				Alphadup.add(b);
				System.out.println();
			}
		}
		 
		 System.out.println(dup.size());
		 System.out.println(Alphadup);
		 
		
			 
	}
}
