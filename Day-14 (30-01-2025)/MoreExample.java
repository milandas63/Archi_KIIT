package com.packages;

public class MoreExample {
	
	public MoreExample() {
		String value = "23432";
		String exp = "4554";
		String total = value+exp;
		System.out.println(total);
		int pvalue = Integer.parseInt(value);
		int pexp = Integer.parseInt(exp);
		int ptotal = pvalue+pexp;
		System.out.println(ptotal);
		
		double dvalue = Double.parseDouble(value);
		double dexp = Double.parseDouble(exp);
		System.out.println(dvalue+exp);
		
		
	}

	public static void main(String[] args) {
		new MoreExample();
	}

}
