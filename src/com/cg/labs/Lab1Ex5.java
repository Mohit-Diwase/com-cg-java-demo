package com.cg.labs;

import java.util.Scanner;
// Prigarm working fine
public class Lab1Ex5 {
	public static int calculateSum(int n) {

		int sum = 0, j;

		int i = Integer.MAX_VALUE;

		for (int k = 0; k <= n; k++) {
			for (j = 1; j <= i; j++) {
				if (j % 3 == 0 || j % 5 == 0) { // System.out.println("print j"+j);
					sum += j;
					// System.out.println("print sum"+sum);
					k++;
					if (k == n) {
						break;
					}
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n =");
		int num = sc.nextInt();
		sc.close();

		System.out.println("sum of first  " + num + "  natural number is  " + Lab1Ex5.calculateSum(num));
	}

}
