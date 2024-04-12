package com.jr.rangeprogram;

public class HappyRange {
	
	public static int isHappy(int n) {
		int sum = 0;
		while(n>0) {
			int r = n%10;
			int sq = r*r;
			sum+=sq;
			n/=10;
		}
		
		return sum;		
	}

	public static void main(String[] args) {		
		
		int start = 2;
		int end = 100;
		//boolean happy = true;
		for(int i=start;i<=end;i++) {
			int result = i;
			while(result!=1 && result!=4) {
				
			
				result = isHappy(result);
			}
			
			//if(happy) {
				if(result==1) {
					System.out.print(i+" ");
				}
			//}
			//happy = !happy;
						
		}
//		int num = 13;
//		int m = num;
//		while(m!=1 && m!=4) {
//			isHappy(m);
//		}
//		if(m==1) {
//			System.out.println("Happy");
//		}
//		else {
//			System.out.println("Not Happy");
//		}
	}

}
