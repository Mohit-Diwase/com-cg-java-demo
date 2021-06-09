package com.cg.labs;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Ex3 {

	static void getSorted(int[] arr) {
		StringBuilder string = new StringBuilder();
		string.append(Arrays.toString(arr));
		string.reverse();
		System.out.println("Reversed Array =" + string);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array = ");
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the array Element = ");
			array[i] = sc.nextInt();

		}
		sc.close();

		System.out.println("Entered Array = " + Arrays.toString(array));

		Lab2Ex3.getSorted(array);

		Arrays.sort(array);
		System.out.println("Sorted Array = " + Arrays.toString(array));

	}

}
//Collections.reverse(Arrays.asList(null));