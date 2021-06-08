package com.cg.labs;

import java.util.Scanner;

public class Lab1Ex6 {
	public static int calculateDiff(int n) {

		int sum = 0;
		int sum1 = 0;

		for (int i = n; i > 0; i--) {

			sum = sum + (i * i);

		}

		for (int i = n; i > 0; i--) {

			sum1 = sum1 + i;
			n--;

		}
		return n = Math.abs(sum - (sum1 * sum1));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n= ");
		int num = sc.nextInt();
		sc.close();

		System.out.println("Difference between two sums is= " + Lab1Ex6.calculateDiff(num));

	}

}