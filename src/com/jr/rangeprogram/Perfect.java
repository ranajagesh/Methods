package com.jr.rangeprogram;

public class Perfect {

	public static int perfect(int num) {
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
			sum+=i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int start = 1;
		int end = 10000;
		
		for (int i=start;i<=end;i++) {
			if(i==perfect(i)) {
				System.out.println(i);
			}
		}
	}

}
