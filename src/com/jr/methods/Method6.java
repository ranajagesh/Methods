package com.jr.methods;

public class Method6 {

	static int i;
	static void m1() {
		System.out.println(i);
	}
	void m2() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Method6 a1 = new Method6();
		Method6.m1();
		a1.m2();
		Method6 a2 = new Method6();
		a2.m1();
		a2.m2();
	}

}
