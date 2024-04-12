package com.jr.methodoverloading;



public class Factorial {
	public static int factor(int num) {
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int num =5;
		if(num>0) {
			System.out.println(num+" ! "+factor(num));
		} else {
			System.out.println("No Negatives");
		}
	}
}
