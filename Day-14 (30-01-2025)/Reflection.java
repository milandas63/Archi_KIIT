package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public Reflection(String name) {
		StringBuffer buf = new StringBuffer();
		try {
			Class obj = Class.forName(name);
			Field f[] = obj.getDeclaredFields();
			Constructor c[] = obj.getDeclaredConstructors();
			Method m[] = obj.getDeclaredMethods();
			
			buf.append(name);
			buf.append("\r\n");
			for(int i=0; i<name.length(); i++) buf.append("-");
			buf.append("\r\n");

			if(f.length>0) {
				buf.append("FIELDS:\r\n");
				for(int i=0; i<f.length; i++) {
					buf.append((i+1)+": "+remove(f[i].toString())+"\r\n");
				}
			}

			if(c.length>0) {
				buf.append("CONSTRUCTORS:\r\n");
				for(int i=0; i<c.length; i++) {
					buf.append((i+1)+": "+remove(c[i].toString())+"\r\n");
				}
			}

			if(m.length>0) {
				buf.append("METHODS:\r\n");
				for(int i=0; i<m.length; i++) {
					buf.append((i+1)+": "+remove(m[i].toString())+"\r\n");
				}
			}
			
			System.out.println(buf);
		} catch(ClassNotFoundException e) {
			
		}
	}

	private String remove(String line) {
		char c;
		boolean yn = true;

		StringBuffer buf = new StringBuffer();
		for(int i=line.length()-1; i>=0; i--) {
			c = line.charAt(i);
			switch(c) {
			case '.': yn = false; break;
			case ' ': yn = true; break;
			case ',': yn = true; break;
			case '[': yn = true; break;
			case ']': yn = true; break;
			case '(': yn = true; break;
			case ')': yn = true; break;
			}
			if(yn) buf.insert(0, c);
		}
		
		return buf.toString();
	}
	
	public static void main(String[] args) {
		String name = "java.lang.String";
		new Reflection(name);
	}

}
