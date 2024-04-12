package com.jr.methods;

public class Prime {

	public static boolean isPrime(int num) {
		if(num==1) return false;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==1) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {

//		int start =1;
//		int end =100;
//		
//		for(int i=start;i<end;i++) {
//			if(isPrime(i)) {
//				System.out.println(i+" ");
//			}
//		}
//		
		
		int n = 7;
		if(isPrime(n)) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

}
