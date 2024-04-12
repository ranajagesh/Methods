package com.jr.methods;

public class Method8 {

	static int i;
	int j;
	public static void main(String[] args) {
		Method8 m1 = new Method8();
		Method8 m2 = new Method8();
		m1.i = 10;
		m2.i =20;
		m1.j = 30;
		m2.j = 40;
		
		System.out.println(m1.i+" "+m2.i+" "+m1.j+" "+m2.j);
		
	}

}
