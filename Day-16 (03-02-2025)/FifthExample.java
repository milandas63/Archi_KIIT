package com.gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FifthExample extends JFrame {
	JButton btnDummy;
	
	public FifthExample() {
		this.setLayout(new GridLayout(6,7));
		
		String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		for(String day:days) {
			btnDummy = new JButton(day);
			this.add(btnDummy);
		}

		for(int i=1; i<=31; i++) {
			btnDummy = new JButton(String.valueOf(i));
			this.add(btnDummy);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400, 150, 500, 350);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FifthExample();
	}

}
