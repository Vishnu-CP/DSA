package com.vishnu.test;

import java.util.ArrayList;
import java.util.List;

public class MaxProfit {
	
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int maxProfit(final List<Integer> A) {
    	 int profit=0;
    	for(int i= 0; i< A.size()-1 ; i++) {
    		if(A.get(i) < A.get(i+1)) {
    			profit += A.get(i+1)-A.get(i);
    		}else {
    			//profit += A.get(i);
    		}
    	}
    	 System.out.println(profit);
		return profit;
    	
    }
    public static void main(String[] args) {
    	ArrayList<Integer> al = new ArrayList<Integer>();
//    	al.add(7);
//    	al.add(1);
    	al.add(5);
    	al.add(3);
    	al.add(1);
//    	al.add(4);
    	
    	maxProfit(al);
	}


}
