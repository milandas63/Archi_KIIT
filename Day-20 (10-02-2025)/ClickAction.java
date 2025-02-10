package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class ClickAction implements ActionListener {
	JDesktopPane desktop;
	String title;
	
	public ClickAction(JDesktopPane desktop, String title) {
		this.desktop = desktop;
		this.title = title;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JInternalFrame iframe = new JInternalFrame(title);
		iframe.setBounds(25, 25, 600, 300);
		iframe.setClosable(true);
		iframe.setMaximizable(true);
		iframe.setIconifiable(true);
		desktop.add(iframe);
		iframe.setVisible(true);
	}

}
