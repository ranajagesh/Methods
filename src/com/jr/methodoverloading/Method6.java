package com.jr.methodoverloading;

public class Method6 {

	public static void add(int x) {
		System.out.println(x+x);
	}
	
	public static void add(int x,int y) {
		System.out.println(x+y);
	}
	public static void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		Method6.add(5);
		Method6.add(5,6);
		Method6.add(6, 7, 8);
	}

}
