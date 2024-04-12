package com.jr.methodoverloading;

import java.util.Scanner;

public class Length {

	public  static long length(long num) {
		int len = 0;
		while(num>0) {
			num/=10;
			len++;
		}
		
		return len;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		long num = sc.nextLong();
		if(num<0) {
			System.out.println("No Negatives");
		} else {
			System.out.println(num+" Length is "+length(num));
		}
		sc.close();
	}

}
