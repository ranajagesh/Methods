package com.jr.methods;

public class Palindrome {

	public static int isPalindrome(int n) {
		int rev = 0;
		while(n>0) {
			int r = n%10;
			rev = rev*10+r;
			n/=10;
		}
		
		return rev;
		
	}
	
	public static void main(String[] args) {

		int num = 121;
		if(isPalindrome(num)==num) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}

}
