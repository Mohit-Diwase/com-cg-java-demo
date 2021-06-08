package com.cg.labs;

import java.util.Scanner;

public class Exercise5Lab1 {


public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter number");
            int n = sc.nextInt();
            
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
            System.out.println("sum of first  "+n+"  natural number is  "+sum);
            

 

}
}