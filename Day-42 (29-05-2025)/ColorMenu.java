package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class ColorMenu {
	public JFrame f;
	public JSplitPane jsp;
	public JButton btnDummy;
	public JPanel pnlRight;
	public JDesktopPane desktop;
	
	public ColorMenu() {
		f = new JFrame("Calandar");
		f.setLayout(new BorderLayout());

//		pnlRight = new JPanel();
//		pnlRight.setBackground(Color.white);
		desktop = new JDesktopPane();
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, listMenuIems(), desktop);
		jsp.setDividerLocation(155);
		f.add(jsp, BorderLayout.CENTER);

		JToolBar tbar = new JToolBar("Toolbar");
		f.add(tbar, BorderLayout.NORTH);
			JButton btnExit = new JButton(new ImageIcon("images/exit.png"));
			btnExit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			tbar.add(btnExit);
		
		JMenuBar mbar = new JMenuBar();
		f.setJMenuBar(mbar);

		JMenu mnuFile = new JMenu("File");
		mnuFile.setIcon(new ImageIcon("images/new.png"));
		mnuFile.setMnemonic('F');
		mbar.add(mnuFile);
			JMenu mnuFileNew = new JMenu("New");
			mnuFileNew.setMnemonic('N');
			mnuFile.add(mnuFileNew);
				JMenuItem mnuFileNewHtml = new JMenuItem("HTML Page");
				mnuFileNew.add(mnuFileNewHtml);
				JMenuItem mnuFileNewJava = new JMenuItem("Java Program");
				mnuFileNew.add(mnuFileNewJava);
				JMenuItem mnuFileNewPython = new JMenuItem("Python Program");
				mnuFileNew.add(mnuFileNewPython);
			JMenuItem mnuFileOpen = new JMenuItem("Open");
			mnuFileOpen.setMnemonic('O');
			mnuFile.add(mnuFileOpen);

			mnuFile.addSeparator();
			JMenuItem mnuFileClose = new JMenuItem("Close");
			mnuFile.add(mnuFileClose);
			JMenuItem mnuFileCloseAll = new JMenuItem("Close All");
			mnuFile.add(mnuFileCloseAll);

			mnuFile.addSeparator();
			JMenuItem mnuFileSave = new JMenuItem("Save");
			mnuFile.add(mnuFileSave);
			JMenuItem mnuFileSaveAll = new JMenuItem("Save All");
			mnuFile.add(mnuFileSaveAll);
			JMenuItem mnuFileSaveAs = new JMenuItem("Save As");
			mnuFile.add(mnuFileSaveAs);

			mnuFile.addSeparator();
			JMenuItem mnuFileExit = new JMenuItem("Exit");
			mnuFile.add(mnuFileExit);

		JMenu mnuEdit = new JMenu("Edit");
		mnuEdit.setMnemonic('E');
		mbar.add(mnuEdit);
			JMenuItem mnuEditCut = new JMenuItem("Cut");
			mnuEditCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
			mnuEdit.add(mnuEditCut);
			JMenuItem mnuEditCopy = new JMenuItem("Copy");
			mnuEdit.add(mnuEditCopy);
			JMenuItem mnuEditPaste = new JMenuItem("Paste");
			mnuEdit.add(mnuEditPaste);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setIconImage(new ImageIcon("images/title.png").getImage());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(0, 0, dim.width, dim.height-50);
		f.setVisible(true);
	}

	private JPanel listMenuIems() {
		JPanel pnlLeft = new JPanel(new GridLayout(15,1));
		String lstButton[] = {"Membership","Red","Green","Blue","Gray","Yellow","Orange","Cyan","Magenta","Black","White"}; 
		for(int i=0; i<lstButton.length; i++) {
			btnDummy = new JButton(lstButton[i]);
			btnDummy.setActionCommand(lstButton[i]);
			btnDummy.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					String strBtnName = ae.getActionCommand();
					if(strBtnName.equals("Membership")) {
						JInternalFrame iFrame = new JInternalFrame("Membership");
						iFrame.setBounds(5, 5, 300, 200);
						desktop.add(iFrame);
						iFrame.setVisible(true);
					}
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
