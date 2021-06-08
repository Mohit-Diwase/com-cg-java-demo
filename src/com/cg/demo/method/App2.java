package com.cg.demo.method;

public class App2 {

	public static void main(String[] args) {
		
		Product prd = new Product("A001", 10.0, "Nov 2021", "Commercial");
				System.out.println(prd.toString());
				
		Product prd1 = new Product("A002", 10.5, "Dec 2021", "Residential");
				System.out.println(prd1.toString());
				
				Product prd2 = new Product(12.5, "Dec 2021", "Residential");
				System.out.println(prd2.toString());
	}
}
