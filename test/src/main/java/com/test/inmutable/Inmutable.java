package com.test.inmutable;

final class Inmutable {

	  private final String name;
	  private final int regNo;
	
	  
	public Inmutable(String name, int regNo) {
		super();
		this.name = name;
		this.regNo = regNo;
	}

	
	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}
}
