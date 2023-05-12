package com.test.creationalDesignpattern;

public class SingletonSycronizedMethod {
	private static SingletonSycronizedMethod instance;

	private SingletonSycronizedMethod() {
	}

	public static synchronized SingletonSycronizedMethod getSingleton() {
		if (instance == null) {
			
			instance = new SingletonSycronizedMethod();// lazy intilization instance will be created at request time
				}
		return instance;

	}
}