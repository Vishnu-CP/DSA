package oal.crm.apps.territories.test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RearrageChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aababccc";
		
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			arr[c-'a'] = arr[c-'a']+1;
		}
		PriorityQueue<Key> pq = new PriorityQueue<Key>(new KeyComparator());
		
		for (int i = 0 ; i<26 ; i++) {
			if(arr[i] > 0 ) {
				pq.add(new Key((char)('a'+i),arr[i]));
			}
		}
		System.out.println(pq);
		
		Key prev = new Key('@', -1);
		StringBuilder sb = new StringBuilder();
		while(pq.size() > 0) {
			
			Key k = pq.poll();
			sb.append(k.ch);
			k.freq = k.freq-1;
			
			if (prev.freq > 0 ) {
				pq.add(prev);
			}
			prev=k;
			
		}
		
		if(sb.toString().length() != s.length()) {
			System.out.println("Not possible");
		}else {
			System.out.println(sb.toString());
		}

	}

}

class Key{
	char ch;
	int freq;
	Key(char ch , int freq){
		this.freq = freq;
		this.ch = ch;
		
	}
}

class KeyComparator implements Comparator<Key>{

	@Override
	public int compare(Key o1, Key o2) {
		// TODO Auto-generated method stub
		return  -(o1.freq - o2.freq);
	}
	
}
