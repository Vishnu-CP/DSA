package oal.crm.apps.territories.interview;

import java.util.HashSet;
import java.util.Set;

public class StringTest {
	
	public static void main(String[] args) 
	{
//		String s1 = "hello";
//		String s2 = new String("hello");
//		String s3 = "hello";
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
		
		test2();
	}
	
	static void test2() {
		 		Set<String> aprvlSt = new HashSet<>(5);
		 		aprvlSt.add("Approved");
		 		//aprvlSt.add("Rejected");
	       
	            
	            if (aprvlSt.size() > 1) System.out.println("Partially Approved");
	            else if (aprvlSt.contains("Approved")) System.out.println("Approved");
	            else if (aprvlSt.contains("Rejected")) System.out.println("Rejected");
		
	}

}
