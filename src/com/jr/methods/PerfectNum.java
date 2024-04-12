package com.jr.methods;

public class PerfectNum {

	public static boolean perfect(int num) {
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) sum+=i;
		}
		
		return num==sum;
		
	}
	public static void main(String[] args) {
		int num = 6;
		System.out.println(perfect(num));
	}

}
