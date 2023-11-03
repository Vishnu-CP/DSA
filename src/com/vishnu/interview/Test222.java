package com.vishnu.interview;

public class Test222 {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("hello");
			throw new ArithmeticException();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Helloo Catch");
		}
		finally {
			System.out.println("hello Finally");
		}
	}

}
