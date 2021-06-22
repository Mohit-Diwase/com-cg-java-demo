package com.cg.demo.ios;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	transient double salary; // Transient field will hide the sensitive data

	public Employee() {
		super();
	}

	public Employee(int id, String name, double samary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = samary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
