package com.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ForthExample {
	public ForthExample() {
		JFrame f = new JFrame("BorderLayout Demo");
		f.setLayout(new BorderLayout());

		JLabel lblNorth = new JLabel("North", JLabel.CENTER);
		lblNorth.setOpaque(true);
		lblNorth.setFont(new Font("Arial", Font.BOLD, 18));
		lblNorth.setBackground(Color.yellow);
		f.add(lblNorth, BorderLayout.NORTH);
		
		JLabel lblWest = new JLabel("West", JLabel.CENTER);
		lblWest.setOpaque(true);
		lblWest.setFont(new Font("Arial", Font.BOLD, 18));
		lblWest.setBackground(Color.green);
		f.add(lblWest, BorderLayout.WEST);

		JLabel lblCenter = new JLabel("Center", JLabel.CENTER);
		lblCenter.setOpaque(true);
		lblCenter.setFont(new Font("Arial", Font.BOLD, 18));
		lblCenter.setBackground(Color.red);
		f.add(lblCenter, BorderLayout.CENTER);

		JLabel lblEast = new JLabel("East", JLabel.CENTER);
		lblEast.setOpaque(true);
		lblEast.setFont(new Font("Arial", Font.BOLD, 18));
		lblEast.setBackground(Color.blue);
		f.add(lblEast, BorderLayout.EAST);

		JLabel lblSouth = new JLabel("South", JLabel.CENTER);
		lblSouth.setOpaque(true);
		lblSouth.setFont(new Font("Arial", Font.BOLD, 18));
		lblSouth.setBackground(Color.cyan);
		f.add(lblSouth, BorderLayout.SOUTH);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(400, 150, 500, 350);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new ForthExample();
	}

}
