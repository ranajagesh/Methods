package com.jaggu.NumberProgram;

import java.util.Scanner;

public class PrimeNthNumber {
	
	   private static boolean isPrime(int num) {
	        if (num <=1) {
	            return false;
	        }
	        for (int i = 2; i <= num/2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of n to find the nth prime number: ");
//        int n = sc.nextInt();
		
		int n = 6;

        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                count++;
            }
            if (count < n) {
                number++;
            }
        }

        System.out.println("The " + n + "th prime number is: " + number);
	}
}



       

    

 
