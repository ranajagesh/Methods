package com.jr.methods;

public class MethodB {

	public void m1(int a,float b) {
		System.out.println("Inside m1 method");
		
	}
	public void m1(float a,int b) {
		System.out.println("Overload m1 Method");
	}
	public static void main(String[] args) {
		MethodB m = new MethodB();
		m.m1(20, 20f);
		m.m1(20f, 20);
	}

}
