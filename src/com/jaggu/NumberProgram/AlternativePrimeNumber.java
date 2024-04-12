package com.jaggu.NumberProgram;

public class AlternativePrimeNumber {	
	static int checkPrime(int num) {
		int count = 0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				count = 1;
				break;
			}			
		}
		if(count==0) {
			return 1;		}
		else {
			return 0;
		}
	}
	static void checkAlternative(int n) {
		int temp =2;
		for(int j=2;j<=n-1;j++) {
			if(checkPrime(j) == 1) {
				if(temp%2 == 0) {					
					System.out.print(j+" ");
				}temp++;
			}			
		}		
	}		
	public static void main(String[] args) {
		int num = 100;
	System.out.print("Alternate prime numbers up to " + num+" are: ");
		checkAlternative(num);
		//System.out.println(add());
	}

  
	
}
