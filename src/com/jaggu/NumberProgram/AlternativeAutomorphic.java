package com.jaggu.NumberProgram;

public class AlternativeAutomorphic {

	static boolean isAutomorphic(int num)   
	{   
		int square = num * num;   
	while (num > 0) {   
		if (num % 10 != square % 10) {
			return false;   
		} 
		num = num/10;   
		square = square/10;
	   
	}   
	return true;   
	}
	static void checkAlternative(int n) {
		int temp =2;
		for(int j=2;j<=n-1;j++) {
			if(isAutomorphic(j) == true) {
				if(temp%2 == 0) {					
					System.out.print(j+" ");
				}
				temp++;
			}
		}
	}
	public static void main(String[] args) {
		int start = 1;
		int end = 1000;
		for(int i=start;i<=end;i++) {
			if(isAutomorphic(i)==true)
			System.out.println(i+" ");
		}	
	}

}
