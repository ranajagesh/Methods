package com.jr.methods;

import java.util.Scanner;

public class SpyNumber {

	public static boolean isSpy(int n) {
		int sum = 0;
		int mul = 1;
		while(n>0) {
			int r = n%10;
			sum+=r;
			mul*=r;
			n/=10;
		}		
		return sum==mul;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Spy Number : ");
		int n = sc.nextInt();
		
		if(isSpy(n)) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not Spy Number");
		}
		sc.close();
	}

}
