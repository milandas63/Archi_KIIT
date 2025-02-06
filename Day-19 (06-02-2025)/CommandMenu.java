package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandMenu implements ActionListener {
	public void actionPerformed(ActionEvent ae) {
		String token = ae.getActionCommand();
		if(token.equals("Exit")) {
			System.out.println("Thank you ");
			System.exit(0);
		} else if(token.equals("Normal Text")) {
			
		}
	}

}
