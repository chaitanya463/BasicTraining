package com.chaitanya.ms;

public class Random3 {
	void jumpingOnClouds(int[] c) {
        int count = 0;
        int n = c.length;
        for(int i =0; i < n; i++,count++) {
            if (i < n-2 && c[i+2] == 0) {
                i++;
                System.out.println("after +2 = "+ i);
            }
        }
        System.out.println(count);
    }
	
	public static void main(String...strings) {
		Random3 random = new Random3();
		random.jumpingOnClouds(new int[] {0,0,0,0,1,0});
	}

}
