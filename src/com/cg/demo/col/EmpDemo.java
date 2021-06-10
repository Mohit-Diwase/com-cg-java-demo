package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
//		Delete delete = new Delete();

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(emp);
		empList.add(new Employee());
		empList.add(new Employee(103, "Aaa", 10.5));
//		empList.add("Aaa"); // CE
//		empList.add(delete); // CE
		
		Iterator <Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
		
		for (Employee x : empList) {
			System.out.println(x.toString());
		}

	

	}

}