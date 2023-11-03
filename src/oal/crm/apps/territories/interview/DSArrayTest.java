package oal.crm.apps.territories.interview;

import java.util.Arrays;

public class DSArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 int[] arr = {12,10,12,9,7};
//		 findSecondMax(arr);
		
//		int[] arr = {12,0,10,0,12,9,7,0};
//		moveAllZerotoEnd(arr);
//		int[] arr = {1,2,3,4,5,6,7,9,10};
//		missingNumber(arr);
		
		int[] a = {1,3,5,6,7,10,11};
		int[] b = {2,4,8};
		int[] c = merge(a, b);
		printArr(c);
		
	}
	
	static void  findSecondMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		System.out.println(max);
		
		for(int i = 0 ; i < arr.length ;i++) {
			
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println(max + " "+secMax);
		
		
	}
	
//	p1 goes to 0th emlements and i goes to non zer and swaps
	static void moveAllZerotoEnd(int[] arr) {
		int p1 = 0;
		
		
		for(int i = 0; i < arr.length ; i++) {
			
			if(arr[i] != 0 && arr[p1] == 0) {
			
			int temp =arr[i];
			arr[i]= arr[p1];
			arr[p1] = temp;
			
			}
			if(arr[p1] != 0) {
				p1++;
			}
		}
		
	printArr(arr);
	}
	
	
	static void printArr(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
	
	static void missingNumber(int[] arr) {
		
		int num =  arr.length+1 ;
		int sum = num * (num+1)/2;
		
		for (int a : arr) {
			sum -= a;
		} 
		System.out.println(sum);
	}
	
	
	static int[] merge(int[] a , int[] b) {
		
		int[] out = new int[a.length + b.length];
		
		int i=0 , j=0, k=0;
		
		while ( i < a.length && j < b.length) {
			
			System.out.println(a[i] +":"+b[j]);
			
			if(a[i] <= b[j]) {
				
				out[k++]  = a[i];
				i++;
			}else {
				out[k++]  = b[j];
				j++;
			}
		printArr(out); System.out.println();
		}
		
		for( ; i < a.length ; i++ ) {
			out[k++]  = a[i];
		}
		
		for ( ; j < b.length ; j++ ) {
			out[k++]  =b[j];
		}
		
		return out;
		
	}

}
