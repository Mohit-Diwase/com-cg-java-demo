package com.cg.demo;

import java.util.Scanner;

public class CubeofDigits {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number= ");
		
		int num = sc.nextInt();
		
		int lastdigit, summation = 0;
		
		while (num !=0 ) {
			
			lastdigit = num % 10;
			System.out.println("last digit = " +lastdigit);
			System.out.println("cube = "+lastdigit*lastdigit*lastdigit);
			
			summation = summation + lastdigit*lastdigit*lastdigit;
			num = num/10;
		}
		
		System.out.println("Sum of all the cubes =" +summation);
	}

}
