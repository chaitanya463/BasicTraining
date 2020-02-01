package com.chaitanya.ms;

public class StringBits {
	static int[] A;
	 void binary(int n) {
		 if(n <1) {
			 printArray(A);
		 }
		 else {
			 A[n-1] = 0;
			 binary(n-1);
			 A[n-1] = 1;
			 binary(n-1);
		 }
	}
	 void printArray(int[] A) {
		 for (int i =0; i < A.length; i++) {
			 System.out.print(A[i] +" ");
		 }
		 System.out.println();
	 }
	 public static void main(String...strings) {
		 int n = 4;
		 A = new int[n];
		 StringBits sb = new StringBits();
		 sb.binary(n);
	 }
}
