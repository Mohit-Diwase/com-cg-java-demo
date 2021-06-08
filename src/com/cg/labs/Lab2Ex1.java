package com.cg.labs;

import java.util.Scanner;
import java.util.Arrays;

public class Lab2Ex1 {

	public static int getSecondSmallest(int[] arr) {

		Arrays.sort(arr);
		return (arr[1]);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the Array =");
		int n = sc.nextInt();

		int[] array = new int[n];
		System.out.println("Enter the numbers in array one by one");
		for (int i = 0; i < n; i++) {

			array[i] = sc.nextInt();

		}
		sc.close();
		System.out.println("The second smallest number in the array is = " + Lab2Ex1.getSecondSmallest(array));

	}

}