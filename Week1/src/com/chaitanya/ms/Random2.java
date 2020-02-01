package com.chaitanya.ms;

public class Random2 {
	 long repeatedCount(String s, long n) {
        char matchChar = 'a';
        long count = 0;
        for (int i =0; i<n ; i++) {
        	if (matchChar == s.charAt(i)) {
        		count++;
        	}
        }
        return count;
	 }
	 
	 long repeatedString(String s, long n) {
		 long q = n / s.length();
		 long r = n % s.length();
		 return s.length() > n ? repeatedCount(s, r):
			 q * repeatedCount(s, s.length()) + repeatedCount(s, r);
	 }
	 
	 public static void main(String...strings ) {
		 Random2 random = new Random2();
		 System.out.println(random.repeatedString("aba", 10));
	 }


}
