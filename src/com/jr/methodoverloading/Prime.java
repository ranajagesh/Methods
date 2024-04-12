package com.jr.methodoverloading;

public class Prime {

	public static boolean prime(int num) {
		if(num<1) return false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		int start = 1;
		int end = 1000;
		
		for(int i=start;i<=end;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
