package com.cg.demo;

public class IfDemo {

	public static void main(String[] args) {

		int salary = 12;
		int leaves = 15;
		int expectedSalary = 12;
		int expectedleaves = 20;

		if (salary >= expectedSalary) {
			System.out.println("Join this company.");
		} else {
			System.out.println("Do not join.");
		}

		if ((salary >= expectedSalary) || (leaves >= expectedleaves)) {
			System.out.println("Join this company.");
		} else {
			System.out.println("Do not join.");
		}

		if (salary > expectedSalary) {
			System.out.println(" Join ");
		} else { 
			System.out.println("Don't join");
		}
	}

}
