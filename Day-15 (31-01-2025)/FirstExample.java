package com.gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstExample {
	public FirstExample() {
		JFrame f = new JFrame("My First GUI Program");
		JLabel title = new JLabel("ARCHI", JLabel.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 18));
		title.setForeground(Color.red);
		f.add(title);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(400, 150, 500, 350);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new FirstExample();
	}

}
