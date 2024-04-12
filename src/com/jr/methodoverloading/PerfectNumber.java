package com.jr.methodoverloading;

public class PerfectNumber {

	public static int perfect(int num) {
		
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
			sum+=i;
			System.out.println(sum+" "+i);
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		int n = 28;
		if(n==perfect(n)) {
			System.out.println("Perfect Number");
		} else {
			System.out.println("Not a Perfect Number");
		}
		
	}

}
