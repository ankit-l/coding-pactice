package com.test.example.java8.mapFlatmap;

import java.util.List;

public class Employee {
	
	
	private Integer id;
	private String name;
	private List<String> cities;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Employee(Integer id, String name, List<String> cities) {
		super();
		this.id = id;
		this.name = name;
		this.cities = cities;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cities=" + cities + "]";
	}

}
