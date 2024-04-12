package com.jr.methods;

public class Method1 {
	public static void large() {
		int x = 60;
		int y = 820;
		
		if(x>y) {
			System.out.println("X is large");
		} else {
			System.out.println("Y is Large");
		}
	}

	public static void main(String[] args) {	
		Method1.large();
	}

}
