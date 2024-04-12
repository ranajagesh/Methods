package com.jr.methods;

public class Strong {

	public static int factor(int n) {
		int fact = 0;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}		
		return fact;
		
	}
	public static boolean strong(int n) {
		int sum = 0;
		
		while(n>0) {
			int r =n%10;
			sum+=factor(r);
			n/=10;	
		}
		if(sum==n) return true;
		return false;
	}
	
	public static void main(String[] args) {
//		int num = 145;
//		
//		if(strong(num)) {
//			System.out.println("Strong Number");
//		} else {
//			System.out.println("Not a Strong Number");
//		}
	int st =1;
	int end = 1000;
	for(int i=st;i<=end;i++) {
		if(strong(i) == true) {
			System.out.println(i);
		}
	}
	
		
//		
	}

}
