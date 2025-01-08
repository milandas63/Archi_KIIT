package com.figures;

/*
				              *
				             ***
				            *****
				           *******
				          *********
				         ***********
				        *************
				       ***************
				      *****************
 */

public class Pyramid {
	public static void main(String[] args) {
		int spaces = 30;
		int stars = 1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<spaces; j++) System.out.print(" ");
			for(int j=0; j<stars; j++)  System.out.print("*");
			System.out.println();
			spaces--; stars += 2;
		}

		
		spaces = 30;
		stars = 1;
		for (int m=0; m<17; m++) {
			for(int l=0; l<spaces; l++) System.out.print(" ");
			for(int n=0; n<stars; n++) System.out.print("*");
			System.out.println();
			if(m<8) {
				spaces--; stars += 2;
			} else {
				spaces++; stars -= 2;
			}
		
		}
	}
}
