package com.jr.methods;

public class MethodA {

	public static void change(int n) {
		System.out.println("Inside Method :"+n);
		n = n*6;
		System.out.println("Inside Method After Changing "+n);
	}
	public static void main(String[] args) {
		int n = 10;
		System.out.println(n);
		change(n);
		System.out.println("After Calling Method :"+n);
		
	}

}
