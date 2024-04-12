package com.jr.methods;

public class Method9 {

//	public static int isHappy(int n) {
//		
//		int sum = 0;
//		while(n>0) {
//			int r = n%10;
//			int sq = r*r;
//			sum+=sq;
//			n/=10;
//		}
//		return sum;		
//	}
//	public static void main(String[] args) {
//		int num = 68;
//		int m = num;
//		while(m!=1 && m!=4) {
//			m=isHappy(m);
//		}
//		if(m==1) {
//			System.out.println("Happy Number");
//		} else {
//			System.out.println("Not a Happy Number");
//		}
//	}
	
	
	    public static boolean isHappy(int n) {
	        int slow = n, fast = n;
	        do {
	            slow = sum(slow);
	            fast = sum(sum(fast));
	        } while (slow != fast);
	        return slow == 1;
	    }

	   static int sum(int n) {
	        int sum = 0, rem;
	        while (n > 0) {
	            rem = n % 10;
	            sum += rem * rem;
	            n = n / 10;
	        }
	        return sum;
	    }
	    
	    public static void main(String[] args) {
			int num = 19;
//			Method9 m1= new Method9();
			isHappy(num);
		}
	

}
