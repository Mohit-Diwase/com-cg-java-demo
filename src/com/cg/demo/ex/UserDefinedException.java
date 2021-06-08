package com.cg.demo.ex;

class NewException extends Exception {
	public NewException(String s) {
		super(s);
	}
}

public class UserDefinedException {

	public static void main(String args[]) {
		try {
			throw new NewException("Manually created exception");
		} catch (NewException ex) {
			System.out.println("Exception handled");

			System.out.println(ex.getMessage());
		}
	}
}