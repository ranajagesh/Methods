package com.jr.rangeprogram;

public class Test {

	public static void main(String[] args) {
		
		int start = 1;
		int end = 10;
		
		for(int i=start;i<=end;i++) {
			
			int sum = 0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0)
					{
						sum+=j;
					}
			}
			System.out.println("perfect number is "+i);	
		}

	}

}
