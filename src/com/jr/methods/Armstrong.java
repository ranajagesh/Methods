package com.jr.methods;

public class Armstrong {

	public static int isArmstrong(int n) {
		int m  =n;
		int count = 0;
		int sum = 0;
		
		while(n>0) {
			n/=10;
			count++;
		}
		n=m;
		while(n>0) {
			int r = n%10;
//			int product = 1;
//			
//			for(int i=1;i<=count;i++) {
//				product*=r;
//			}
//			sum+=product;
			sum = (int) (sum + Math.pow(r, count));
			n/=10;
		}		
		
		return sum;
	}
	
	public static void main(String[] args) {

		int num = 153;
		if(isArmstrong(num)==num) {
			System.out.println("Armstrong Number ");
		} else {
			System.out.println("Not a Armstrong Number ");
		}
	}

}
