package com.cg.demo.oop;

public class BankCustomer {

	static int ifsc;
	int acNo;
	String name;
	double balance;

	void checkBalance() {
		System.out.println(balance);
	}

	static void openAccount() {
		System.out.println("Open an account.");
	}

	public static void main(String[] args) {

		BankCustomer c1 = new BankCustomer();
		c1.acNo = 101;
		c1.name = "Sonu";
		c1.balance = 10000;
		System.out.println(c1.acNo + " " + c1.name + " " + c1.balance);
		c1.checkBalance();
		openAccount();
		System.out.println(ifsc);

	}
}
