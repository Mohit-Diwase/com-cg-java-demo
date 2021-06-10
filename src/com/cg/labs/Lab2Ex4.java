package com.cg.labs;

import java.util.*;

public class Lab2Ex4 {

	static int[] modifyArray(int[] arr) {

		// Convert the array into set
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		//convert set into array
		int[] newArr = new int[set.size()];
		int j = 0;

		for (Integer k : set)
			newArr[j++] = k;
		
		//arrange the array in descending order
		int temp = 0;
		for (int l = 0; l < newArr.length; l++) {
			for (int m = l + 1; m < newArr.length; m++) {
				if (newArr[l] < newArr[m]) {
					temp = newArr[l];
					newArr[l] = newArr[m];
					newArr[m] = temp;
				}
			}
		}
		return newArr;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenghth of array =");
		int a = sc.nextInt();
		int[] array = new int[a];
		
		for (int b = 0; b < a; b++) {
			System.out.println("Enter the element of the Array= ");
			array[b] = sc.nextInt();
			
		} sc.close();

		int[] finalArr;

		finalArr = Lab2Ex4.modifyArray(array);

		System.out.println("The required Array is = " + Arrays.toString(finalArr));

	}
} 			//Convert an array into set
			//set will automatically remove duplicate values
			//convert the set into array
			//arrange the array in descending order
			//return array