package com.chaitanya.ms;

public class TowerOfHanoi {

	static void toh(int n, char s, char a, char d) {
		if(n==1) {
		System.out.println("Move the disk from = " + s + " to = "+d);
		return;
		}
		toh(n-1,s, d, a);
		System.out.println("Move to the disk from peg = " + s + " to peg = "+ d);
		toh(n-1,a,s,d);
	}
	
	public static void main(String...strings) {
		TowerOfHanoi.toh(3, 'A', 'B', 'C');
	}
}
