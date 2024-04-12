package com.jr.rangeprogram;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		
		if(n<=1) return false;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		int prime = 0;
		for(int i=end;i>=start;i--) {
			if(isPrime(i)) {
				//if(prime) {
				prime++;
//				System.out.print(i+" ");
				//}
				//prime = !prime;
				
				if(prime==1) {
					System.out.print(i+" ");
				}
			}
		}
	}

}
