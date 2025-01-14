package com.pattern;

/*
 * 		d)  1,  3,  5,  11,   21, ......      (n, n*2-1, n*2+1, n*2-1, n*2+1, ...
 */

public class SeriesD {
	public static void main(String[] args) {
		int seed = 1;

		for(int count=0; count<10; count++) {
			if(count%2==0) {
				seed = seed*2-1;
			} else {
				seed = seed*2+1;
			}
			System.out.print(seed+", ");
		}
	}
}
