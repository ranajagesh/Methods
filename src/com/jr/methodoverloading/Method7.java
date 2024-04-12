package com.jr.methodoverloading;

public class Method7 {

	public static void m1(int a) {
		System.out.println("m1(int)");
	}
	public static void m1(String s) {
		System.out.println("m1(String)");
	}
	
	public static void main(String[] args) {
		Method7.m1(67);
		Method7.m1("Ram");
	}

}
