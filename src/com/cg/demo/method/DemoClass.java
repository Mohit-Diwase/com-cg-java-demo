package com.cg.demo.method;

/*
 * access modifiers 
 * private - can be accessed only from within the class 
 * <package> or (default) - can be accessed only from within the package 
 * protected - can be accessed from package and the subclasses 
 * public - can be accessed from anywhere within the program 
 * 
 * class, interface, enum - public, <package>
 * fields, methods and constructors - all 
 */

public class DemoClass {

	public int publicField = 10;
	protected int protectedField = 20;
	int packageField = 30;
	private int privateField = 40;

	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		System.out.println(obj.publicField);
		System.out.println(obj.protectedField);
		System.out.println(obj.packageField);
		System.out.println(obj.privateField);
	}

}