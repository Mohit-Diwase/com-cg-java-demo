package com.cg.labs;
//Power of two
import java.util.Scanner;
public class Lab1Ex8 {

 

    static boolean checkNumber(int n) {
        while(n % 2==0) {
            n=n/2;
                }
        if(n==1) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();    
        
        if (checkNumber(n))
            System.out.println(n + " is a power of 2");
        else
            System.out.println(n + " isnot a power of 2");
        
    }   
}