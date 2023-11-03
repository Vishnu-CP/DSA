package com.vishnu.interview;

import java.math.BigDecimal;

public class Test {
	
	public static void main(String[] args) {
//		System.out.println(100+100+"hello");
//		System.out.println("hello"+100+100);
//		
//		BigDecimal bd1 = new BigDecimal("100.032");
//		System.out.println(bd1.toString());
//		
//		BigDecimal bd2 = new BigDecimal("100.042");
//		System.out.println(bd2.toString());
//		
//		System.out.println(bd1.subtract(bd2));
//		
//		Double d1 = 100.32;
//		Double d2 =100.42;
//		System.out.println(d1 );
//		System.out.println(d2);
//		System.out.println(d1-d2);
//		
		int[] arr = new int[] {1,2,0,4,5};
		productArray(arr);
		
	}
	
	static void productArray(int[] arr) {
		
		int totpdt = 1;
		for(int i= 0 ; i< arr.length ; i++) {
			totpdt*=arr[i];
		}
		
		for(int i= 0 ; i< arr.length ; i++) {
			arr[i] = totpdt/arr[i];
		}
		
		for(int i= 0 ; i< arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
