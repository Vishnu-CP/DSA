package com.vishnu.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayOps {
	
	//sort by frequency, if same then sort via values
	static void sortByFrequency(int[] arr) {
		
		
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int val : arr) {
			map.put(val,map.getOrDefault(val, 0)+ 1);
		}
		
		List<Map.Entry<Integer, Integer>> lis = new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
		
		
		
//		for (Map.Entry<Integer, Integer>  entry :map.entrySet()) {
//			lis.add(entry);
//		}
//		
		Collections.sort(lis, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue().compareTo(o2.getValue()) == 0) {
					
					return o1.getKey() -o2.getKey();
					
				}else {
					return o2.getValue() - o1.getValue();
				}
			}
			
		});
		
		System.out.println(lis);
		
		//for(Map.Entry<Integer, Integer>)
		
		
		
	}
	
	
		static void sortByFrequency2(Integer[] arr) {
				
				List<Integer> list = Arrays.asList(arr);
				
				Map<Integer,Integer> map = new HashMap<Integer, Integer>();
				for(int val : arr) {
					map.put(val,map.getOrDefault(val, 0)+ 1);
				}
				
				Collections.sort(list, (o1 ,o2) -> {
					
					
					if(map.get(o1) == map.get(o2)) {
						
						return o2 -o1 ;
						
					}else {
						return map.get(o2) - map.get(o1) ;
					}
					
				});
				
				
				System.out.println(list);
				
				
				
			}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {10,20,30,40,30,40,40,50,50,60};
		sortByFrequency2(arr);

	}

}
