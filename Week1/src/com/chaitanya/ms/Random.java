package com.chaitanya.ms;

import java.util.HashMap;
import java.util.Map;

public class Random {
	
	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i =0; i < ar.length; i++) {
			if(map.get(ar[i]) == null) {
				map.put(ar[i], 1);
			}
			else {
				map.put(ar[i], map.get(ar[i])+1);
			}
		}
		int pair = 0;
		for(int i : map.values()) {
			System.out.println( " i = " + i);
			pair += i/2;
		}
		return pair;
    }
	public static void main(String...strings ) {
		System.out.println("hello worlds");
		
		int pairs = Random.sockMerchant(9, new int[] {10,20,10,30,10,40,40,30,50});
		System.out.println("number of pairs = " + pairs);
	}
}