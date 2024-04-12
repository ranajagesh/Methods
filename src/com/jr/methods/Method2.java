package com.jr.methods;

public class Method2 {
	
	public static void add(int a,int b) {
		int result = a+b;
		System.out.println("Add :"+result);
	}
	
	public static void main(String[] args) {
//		Method2.add(25, 24);
		int a = 25;
		int b = 45;
		Method2.add(a, b);
		
		
	}
}
