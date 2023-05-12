package com.test.example.java8.mapFlatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder.In;

public class MainEX {
	
	public static void main(String[] args) {
		
		List<String> citiesWorkIn= new ArrayList<String>();
		citiesWorkIn.add("Pune");
		citiesWorkIn.add("Nagpur");
		citiesWorkIn.add("Amravati");
		citiesWorkIn.add("Banglore");
		
		Employee e1= new Employee(1, "Ankit", citiesWorkIn);
		List<String> citiesWorkIn1= new ArrayList<String>();
		citiesWorkIn1.add("Noida");
		citiesWorkIn1.add("Warud");
		citiesWorkIn1.add("Morshi");
		citiesWorkIn1.add("Pune");
		Employee e2= new Employee(2, "Amar", citiesWorkIn1);
		
		List<String> citiesWorkIn2= new ArrayList<String>();
		citiesWorkIn2.add("Mumbai");
		citiesWorkIn2.add("akola");
		citiesWorkIn2.add("lonawada");
		Employee e3= new Employee(3, "Amey", citiesWorkIn2);
		
		
		List<String> citiesWorkIn3= new ArrayList<String>();
		citiesWorkIn2.add("newMumbai");
		citiesWorkIn2.add("yawatmal");
		citiesWorkIn2.add("Pune");
		Employee e4= new Employee(4, "Mayur", citiesWorkIn3);
		List<Employee> empList= new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		System.out.println(empList.toString());
		
		// old way to find id of list
		
		List<Integer> empIds= new ArrayList<Integer>();
		for (Employee emp : empList) {
			empIds.add(emp.getId());
		}
		System.out.println("print Id old way"+empIds);
		
		List<Integer> empId8= empList.stream()
				.map(emp-> emp.getId()).collect(Collectors.toList());
		System.out.println("print Id New Way Java with map fuction --  "+empId8);
		
		

		Set<List<String>> empIdmap=  empList.stream()
				.map(emp-> emp.getCities()).collect(Collectors.toSet());
		
		System.out.println("= use Map with list of list check --"+empIdmap);
		
		
		Set<String> empIdFlat=  empList.stream()
				.flatMap(emp-> emp.getCities().stream()).collect(Collectors.toSet());
		
		System.out.println("why use Map with list of list check"+empIdFlat);
		
	}
	

}
