package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class ColorMenu {
	public JSplitPane jsp;
	public JButton btnDummy;
	public JPanel pnlRight;
	
	public ColorMenu() {
		JFrame f = new JFrame("Calandar");
		f.setLayout(new BorderLayout());
		
		pnlRight = new JPanel();
		pnlRight.setBackground(Color.white);
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listMenuIems(), pnlRight);
		jsp.setDividerLocation(155);
		f.add(jsp, BorderLayout.CENTER);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(390, 200, 600, 350);
		f.setVisible(true);
	}

	private JPanel listMenuIems() {
		JPanel pnlLeft = new JPanel(new GridLayout(15,1));
		String lstButton[] = {"Red","Green","Blue","Gray","Yellow","Orange","Cyan","Magenta","Black","White"}; 
		for(int i=0; i<lstButton.length; i++) {
			btnDummy = new JButton(lstButton[i]);
			btnDummy.setActionCommand(lstButton[i]);
			btnDummy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					String strBtnName = ae.getActionCommand();
					pnlRight.setBackground(getColorObject(strBtnName));
				}
			});
			pnlLeft.add(btnDummy);
		}

		return pnlLeft;
	}

	private Color getColorObject(String strBtnName) {
		Color obj = Color.WHITE;
		if(strBtnName.equalsIgnoreCase("Black")) {			obj = Color.black;
		} else if(strBtnName.equalsIgnoreCase("White")) {	obj = Color.white;
		} else if(strBtnName.equalsIgnoreCase("Magenta")) {	obj = Color.magenta;
		} else if(strBtnName.equalsIgnoreCase("Cyan")) {	obj = Color.cyan;
		} else if(strBtnName.equalsIgnoreCase("Orange")) {  obj = Color.orange;
		} else if(strBtnName.equalsIgnoreCase("Yellow")) {	obj = Color.yellow;
		} else if(strBtnName.equalsIgnoreCase("Gray")) {	obj = Color.gray;
		} else if(strBtnName.equalsIgnoreCase("Blue")) {	obj = Color.blue;
		} else if(strBtnName.equalsIgnoreCase("Green")) {	obj = Color.green;
		} else if(strBtnName.equalsIgnoreCase("Red")) {		obj = Color.red;
		}
		return obj;
	}
	
	public static void main(String[] args) {
		new ColorMenu();
	}

}
