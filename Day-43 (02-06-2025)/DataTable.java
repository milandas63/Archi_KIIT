package com.swing;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;

public class DataTable extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTable table;

	public DataTable() {
		this.setTitle("JTable Demo");
		this.setIconImage(new ImageIcon("images/flower.png").getImage());
		this.setLayout(new BorderLayout());
		
		//table = new JTable(10,6);
		table = new JTable(new MyTableModel());
		this.add(table, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20,20,1000,500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new DataTable();
	}
}
