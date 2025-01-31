package com.packages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class ManyMoreExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		//	31-01-2025   dd-mm-yyyy
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf1.format(now));
		SimpleDateFormat sdf2 = new SimpleDateFormat("E=u hh:mm:ss a");
		System.out.println(sdf2.format(now));

		
		//String text = "It split a string from a distinguished character";
		String text = "It,split,a,string,from,a,distinguished,character";
		StringTokenizer stoken = new StringTokenizer(text,",");
		while(stoken.hasMoreElements()) {
			System.out.println(stoken.nextElement());
		}
	}

}
