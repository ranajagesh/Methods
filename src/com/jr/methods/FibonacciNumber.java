package com.jr.methods;

public class FibonacciNumber {

	public static int fibonacci(int n) {
//		if(n<=1) {
//			return n;
//		} return fibonacci(n-1)+fibonacci(n-2);
		
		
		int a = 0;
		int b = 1;
		int c;
		if(n==0) return a;
		
		for (int i=2;i<=n;i++) {
			c = a+b;			
			a=b;
			b=c;
		}
		return b;
		
		
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibonacci(n));
	}

}
