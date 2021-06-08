package com.cg.demo.oop;

class Employee {

	int id;
	String name;
	double salary;
	
	void work() {
		System.out.println("Employee works ");
	}
}

public class App {
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.id = 101;
        obj.name = "Sonu";
        obj.salary = 10.5;
        obj.work();

 

        System.out.println(obj.id + " " + obj.name + " " + obj.salary);
		
	}

}
