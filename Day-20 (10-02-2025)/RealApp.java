package com.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class RealApp extends JFrame {
	private JSplitPane jsp;
	private JDesktopPane desktop;
	
	public RealApp() {
		this.setLayout(new BorderLayout());
		
		desktop = new JDesktopPane();
		
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, buttonPanel(), desktop);
		jsp.setDividerLocation(200);
		this.add(jsp, BorderLayout.CENTER);
		
		this.setIconImage(new ImageIcon("bird.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 75, 1000, 600);
		this.setVisible(true);
	}

	private JPanel buttonPanel() {
		JPanel pnlButtons = new JPanel(new GridLayout(15,1));
		String[] buttonLabels = {"New","Close","Close All","Close As","Open","Open With"};
		JButton btnDummy;
		for(int i=0; i<buttonLabels.length; i++) {
			btnDummy = new JButton(buttonLabels[i]);
			btnDummy.setBackground(Color.pink);
			btnDummy.setBorder(BorderFactory.createEtchedBorder());
			btnDummy.addActionListener(new ClickAction(desktop, buttonLabels[i]));
			pnlButtons.add(btnDummy);
		}
		return pnlButtons;
	}
	
	public static void main(String[] args) {
		new RealApp();
	}
}
