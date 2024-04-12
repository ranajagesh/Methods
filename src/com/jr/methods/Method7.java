package com.jr.methods;

public class Method7 {

	int i;
	static void m1() {
//		System.out.println(i);
	}
	void m2() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Method7 b1 = new Method7();
		b1.m2();
		b1.i=10;
		b1.m2();
		b1.i=100;
		b1.m2();
	}
}
