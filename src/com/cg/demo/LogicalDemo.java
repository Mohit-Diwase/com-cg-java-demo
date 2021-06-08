package com.cg.demo;


//    &&   ||   !

public class LogicalDemo {

	public static void main(String[] args) {

		int salary = 9;
		int leaves = 22;
		int expectedSalary = 10;
		int expectedleaves = 20;

//		System.out.println(salary >= expectedSalary);
//		System.out.println(leaves >= expectedleaves);

		System.out.println((salary >= expectedSalary) && (leaves >= expectedleaves)); // false 

		System.out.println((salary >= expectedSalary) || (leaves >= expectedleaves)); // true 
		
		if ((salary >= expectedSalary) && (leaves >= expectedleaves) == true) {
			System.out.println(" Suitable company");
		} else {
			System.out.println("Do not join");
			
		}
	}

}