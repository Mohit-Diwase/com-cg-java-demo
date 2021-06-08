package com.cg.labs;

import java.util.Arrays;

// Need to check the output
public class Lab2Ex2 {

	public static String[] sortStrings(String[] arr) {
		System.out.println(" ");

		Arrays.sort(arr);

		for (int i = 0; i < arr.length / 2; i++) {
			System.out.println(arr[i].toUpperCase());
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			System.out.println(arr[i].toLowerCase());
		}
		return arr;

	}

	public static void main(String[] args) {

//		String[] str = { "Abc", "Zzz", "www", "aaa", "Vvv", "Ppp", "Sss" };
		String[] str = { "a", "Z", "w", "A", "V", "p", "s" };

		for (String s : Lab2Ex2.sortStrings(str)) {
			System.out.println(s);
		}

	}

}