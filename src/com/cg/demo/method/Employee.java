package com.cg.demo.method;

 

public class Employee {

 

    int id;
    String name;
    double salary;
    
    Employee() {
    	System.out.println("Default Constructor");
    }
    
Employee(int id, String name) {
    	
    	this.id = id;
    	this.name = name;
    	
    	System.out.println(" two Paramteterized Constructor");
    }
    
    Employee(int id, String name, double salary) {
    	
    	this.id = id;
    	this.name = name;
    	this.salary = salary;
    	
    	
    	System.out.println(" Paramteterized Constructor");
    }

 

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

 

}