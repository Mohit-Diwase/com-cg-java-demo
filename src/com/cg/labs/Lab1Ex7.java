package com.cg.labs;

import java.util.Scanner;

public class Lab1Ex7 {
	public boolean checkNumber(int number) {

		String str = Integer.toString(number);
		boolean isIncreasingNumber = false;

		for (int i = 0; i < str.length() - 1; i++) { // 1233456 - Yes <= No <
			if (str.charAt(i) < str.charAt(i + 1)) {
				isIncreasingNumber = true;
			} else {
				isIncreasingNumber = false;
				break;
			}
		}
		return isIncreasingNumber;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");

		int number = sc.nextInt();

		sc.close();

		Lab1Ex7 obj = new Lab1Ex7();

		boolean result = obj.checkNumber(number);

		if (result) {
			System.out.println("This is an increasing number.");
		} else {
			System.out.println("This is NOT an increasing number.");
		}

	}

}
