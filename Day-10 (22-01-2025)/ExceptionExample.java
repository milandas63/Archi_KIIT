package com.exception;

import java.io.IOException;

public class ExceptionExample {
	public ExceptionExample() {
		int p = 25;
		int d = 0;
		int index = 14;
		String[] colors = {"Red","Green","Blue","Black","White","Yellow","Brown","Pink"};
		int position = 25;
		String caption = "Hello World!";

		for(int i=0; i<3; i++) {
			try {
				System.out.println();
				double x = p / d;
				System.out.println(x);
				System.out.println(colors[index]);
				System.out.println(caption.charAt(position));
				throw new IOException();
			} catch(ClassCastException e) {
				System.out.println("ClassCastException: "+e);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException: "+e);
				index = 4;
				i--;
			} catch(StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException: "+e);
				position = 10;
				i--;
			} catch(ArithmeticException e) {
				System.out.println("ArithmeticException: "+e);
				d = 5;
				i--;
			} catch(IOException e) {
			} catch(MyException e) {
			}
		}
	}

	public static void main(String[] args) {
		new ExceptionExample();
	}
}

class MyException extends RuntimeException {
	
}
