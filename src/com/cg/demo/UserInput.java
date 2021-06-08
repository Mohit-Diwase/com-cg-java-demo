package com.cg.demo;

 import java.util.Scanner;
 
public class UserInput {
	 
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your Number= ");
	
	int a = sc.nextInt();
	
	System.out.println("Enter another number= ");
	
	int b = sc.nextInt();
	
	System.out.println(a + b);
}
}
