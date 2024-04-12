package com.jr.methods;

public class Method4 {

	public static int m1() {
		return 5;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Method4.m1());
		
		int r = m1();
		System.out.println(r);
		System.out.println(r++);
		System.out.println(++r);
		
		if(m1()>0) {
			System.out.println("Positive Number");
		} else {
			System.out.println("Negative Number");
		}
//		System.out.println(m1());
		for(int i=1;i<=m1();i++) {
			System.out.println(i);
		}
	}

}
