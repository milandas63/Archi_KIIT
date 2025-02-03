package com.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondExample {
	public SecondExample() {
		JFrame f = new JFrame("My First GUI Program");
		f.setLayout(new FlowLayout());

		JLabel title = new JLabel("ARCHI", JLabel.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 18));
		title.setForeground(Color.red);
		f.add(title);

		JLabel trailer = new JLabel("Kanango");
		trailer.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 18));
		trailer.setForeground(Color.blue);
		f.add(trailer);

		JLabel jan = new JLabel("January");
		jan.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 18));
		jan.setForeground(Color.green);
		f.add(jan);
		
		JLabel feb = new JLabel("February");
		feb.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 18));
		feb.setForeground(Color.blue);
		f.add(feb);

		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(400, 150, 500, 350);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new SecondExample();
	}

}
