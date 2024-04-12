package com.jr.rangeprogram;

public class StrongRange {
	
	static int factor(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}		
		return fact;		
	}
	public static boolean isStrong(int n) {
		int m = n;
		int sum = 0;
		while(n>0) {
			int r = n%10;
			sum+=factor(r);
			n/=10;
			}
		if(sum==m)return true;
		
		return false;
		}		
			
	public static void main(String[] args) {
		int start = 1;
		int end = 100000;
		boolean strong = true;
		for(int i=start;i<=end;i++) {
			if(isStrong(i)==true) {
				if(strong) {
				System.out.println(i+" ");
				}
				strong = !strong;
			}
		}
		
//		int num = 145;
//		if(isStrong(num)==true) {
//			System.out.println("Strong number");
//		}else {
//				System.out.println("Not Strong Number");
//			}
	}

}
