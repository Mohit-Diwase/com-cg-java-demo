package com.cg.demo.practice;

import java.util.Scanner;

class NaturalSum {
	
	public static int calculateSum (int n) {
		
	    int sum=0,j;
	    
	    int i=Integer.MAX_VALUE;
	    
	    for(int k=0;k<=n;k++) {
	    for(j=1;j<=i;j++)
	    {
	        if (j%3==0 || j%5==0)
	        {    //System.out.println("print j"+j);
	        sum+=j;
	        //System.out.println("print sum"+sum);
	        k++;
	        if(k==n) {
	            break;
	        }
	        }
	    }
	    }
	    return sum;
	}
	
}


public class Exercise5Lab1Pilot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n =");
		int num = sc.nextInt();
		
		
		System.out.println("sum of first  "+num+"  natural number is  "+NaturalSum.calculateSum(num));		
	}
	
	

}
   
