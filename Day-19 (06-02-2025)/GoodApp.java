package com.gui;

import java.awt.BorderLayout;
import java.awt.RenderingHints.Key;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class GoodApp extends JFrame {
	public GoodApp() {
		this.setLayout(new BorderLayout());

		JMenuBar mBar = new JMenuBar();
		this.setJMenuBar(mBar);
			JMenu mFile = new JMenu("File");
			mFile.setMnemonic('F');
			mBar.add(mFile);
				JMenu mNew = new JMenu("New");
				mNew.setIcon(new ImageIcon("new.png"));
				mFile.add(mNew);
					JMenuItem mNewNormalText = new JMenuItem("Normal Text");
					mNewNormalText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
					mNew.add(mNewNormalText);
					JMenuItem mNewHTMLPage = new JMenuItem("HTML Page");
					mNew.add(mNewHTMLPage);
					JMenuItem mNewBrowserWindow = new JMenuItem("Browser Window");
					mNew.add(mNewBrowserWindow);
					mNew.addSeparator();
					JMenuItem mNewConfig = new JMenuItem("Configure Template...");
					mNew.add(mNewConfig);
					JMenuItem mNewCCpp = new JMenuItem("C/C++");
					mNew.add(mNewCCpp);
					JMenuItem mNewPerl = new JMenuItem("Perl");
					mNew.add(mNewPerl);
					JMenuItem mNewJava = new JMenuItem("Java");
					mNew.add(mNewJava);
					JMenuItem mNewOthers = new JMenuItem("Others");
					mNew.add(mNewOthers);
				JMenuItem mOpen = new JMenuItem("Open...");
				mOpen.setIcon(new ImageIcon("open.png"));
				mFile.add(mOpen);
				JMenuItem mClose = new JMenuItem("Close");
				mFile.add(mClose);
				JMenuItem mCloseAll = new JMenuItem("Close All");
				mFile.add(mCloseAll);
				mFile.addSeparator();
				JMenuItem mSave = new JMenuItem("Save");
				mFile.add(mSave);
				JMenuItem mSaveAll = new JMenuItem("Save All");
				mFile.add(mSaveAll);
				JMenuItem mSaveAs = new JMenuItem("Save As");
				mFile.add(mSaveAs);
				mFile.addSeparator();
				JMenuItem mExit = new JMenuItem("Exit");
				mExit.addActionListener(new CommandMenu());
				mExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
				mFile.add(mExit);
				

			JMenu mEdit = new JMenu("Edit");
			mEdit.setMnemonic('E');
			mBar.add(mEdit);

		this.setIconImage(new ImageIcon("bird.png").getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400, 150, 550, 450);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new GoodApp();
	}

}
