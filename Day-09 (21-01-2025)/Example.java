package com.packages;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException {
		String className = "java.lang.StringBuffer";
		StringBuffer buf = new StringBuffer();

		Class obj = Class.forName(className);
		Field f[] = obj.getDeclaredFields();
		Constructor c[] = obj.getDeclaredConstructors();
		Method m[] = obj.getDeclaredMethods();

		buf.append(className+"\r\n");
		for(int i=0; i<className.length(); i++)
			buf.append("-");
		buf.append("\r\n");

		if(f.length>0) {
			buf.append("FIELD:\r\n");
			for(int i=0; i<f.length; i++) {
				buf.append((i+1)+": "+remove(f[i].toString())+"\r\n");
			}
		}

		if(c.length>0) {
			buf.append("CONSTRUCTOR:\r\n");
			for(int i=0; i<c.length; i++) {
				buf.append((i+1)+": "+remove(c[i].toString())+"\r\n");
			}
		}

		if(m.length>0) {
			buf.append("METHOD:\r\n");
			for(int i=0; i<m.length; i++) {
				buf.append((i+1)+": "+remove(m[i].toString())+"\r\n");
			}
		}
		
		System.out.println(buf);
	}
	
	private static String remove(String line) {
		char c;
		boolean take = true;
		StringBuffer buf = new StringBuffer();
		for(int i=line.length()-1; i>=0; i--) {
			c = line.charAt(i);
			switch(c) {
			case '.': take = false; break;
			case ' ': take = true; break;
			case ',': take = true; break;
			case ']': take = true; break;
			case '[': take = true; break;
			case ')': take = true; break;
			case '(': take = true; break;
			}
			if(take) buf.insert(0, c);
		}
		return buf.toString();
	}

}
