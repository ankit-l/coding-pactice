package com.test.example.comp;

import java.util.Comparator;
import java.util.Objects;

public class EmployeeDemo  implements Comparable<EmployeeDemo>{
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDemo other = (EmployeeDemo) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	
	@Override
	public String toString() {
		return "EmployeeDemo [id=" + id + ", name=" + name + "]";
	}

	public EmployeeDemo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(EmployeeDemo o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
public static Comparator<EmployeeDemo> comparator =  new Comparator<EmployeeDemo>() {
	
	@Override
	public int compare(EmployeeDemo e1,EmployeeDemo e2) {
		return e1.getName().compareTo(e2.getName());
	}
	
	
};
	
	
}
