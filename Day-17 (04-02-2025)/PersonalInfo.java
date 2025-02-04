package com.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonalInfo extends JFrame {
	private JTextField tfName;
	private JTextField tfParent;
	private JTextField tfLocation;
	private JTextField tfMobile;
	private JTextField tfEmail;
	
	public PersonalInfo() {
		this.setLayout(new BorderLayout());

		JLabel caption = new JLabel("Personal Information System", JLabel.CENTER);
		caption.setFont(new Font("Arial", Font.BOLD, 18));
		caption.setForeground(Color.blue);
		this.add(caption, BorderLayout.NORTH);
		
		JPanel pnlLabel = new JPanel(new GridLayout(9,1));
		this.add(pnlLabel, BorderLayout.WEST);
			JLabel lblName = new JLabel("1. Name:");
			JLabel lblParent = new JLabel("2. Parent:");
			JLabel lblLocation = new JLabel("3. Location:");
			JLabel lblMobile = new JLabel("4. Mobile No.:");
			JLabel lblEmail = new JLabel("5. Email-id:");
			pnlLabel.add(new JLabel());
			pnlLabel.add(new JLabel());
			pnlLabel.add(lblName);
			pnlLabel.add(lblParent);
			pnlLabel.add(lblLocation);
			pnlLabel.add(lblMobile);
			pnlLabel.add(lblEmail);
			pnlLabel.add(new JLabel());
			pnlLabel.add(new JLabel());
		
		JPanel pnlField = new JPanel(new GridLayout(9,1));
		this.add(pnlField, BorderLayout.CENTER);
			tfName = new JTextField();
			tfParent = new JTextField();
			tfLocation = new JTextField();
			tfMobile = new JTextField();
			tfEmail = new JTextField();
			pnlField.add(new JLabel());
			pnlField.add(new JLabel());
			pnlField.add(tfName);
			pnlField.add(tfParent);
			pnlField.add(tfLocation);
			pnlField.add(tfMobile);
			pnlField.add(tfEmail);
			pnlField.add(new JLabel());
			pnlField.add(new JLabel());

		JPanel pnlButton = new JPanel(new GridLayout(1,2));
		this.add(pnlButton, BorderLayout.SOUTH);
			JButton btnSave = new JButton("Save");
			JButton btnExit = new JButton("Exit");
			pnlButton.add(btnSave);
			pnlButton.add(btnExit);
			btnExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					System.out.println("Thank you for using this program");
					System.exit(0);
				}
			});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400, 150, 500, 350);
		this.setVisible(true);
	}
	
	public Insets getInsets() {
		return new Insets(50,100,50,100);
	}
	
	public static void main(String[] args) {
		new PersonalInfo();
	}
}
