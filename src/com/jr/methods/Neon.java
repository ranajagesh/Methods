package com.jr.methods;

import java.util.Scanner;

public class Neon {

	public static int isNeon(int n) {
		
		int sq = n*n;
		int sum = 0;
		while(sq>0) {
			int r = sq%10;
			sum+=r;
			sq/=10;
		}
		return sum;	
		
	}
	public static void main(String[] args) {
//		Scanner sc  =new Scanner(System.in);
//		System.out.println("Enter a Number : ");
//		int n = sc.nextInt();
//		Neon n1 = new Neon();
//		if(n1.isNeon(n)==n) {
//			System.out.println("Neon Number");
//		} else {
//			System.out.println("Not a Neon Number");
//		}
//		sc.close();
		
		int st =1;
		int end = 10000000;
		for(int i=st;i<=end;i++) {
			if(isNeon(i)==i)
			System.out.println(i);
		}
	}

}
