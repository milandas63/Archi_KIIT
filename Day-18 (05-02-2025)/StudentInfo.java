package com.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class StudentInfo extends JFrame {
	private JTextField tfName;
	private JTextField tfParent;
	private JTextField tfLocation;
	private JTextField tfMobile;
	private JTextField tfEmail;
	private JRadioButton rbMale;
	private JRadioButton rbFemale;
	private JCheckBox ckbDPT;
	private JCheckBox ckbMesiles;
	private JCheckBox ckbCovid;
	private JComboBox<String> cbQualif;

	private ButtonGroup bgGender;
	
	public StudentInfo() {
		this.setLayout(new BorderLayout());

		JLabel caption = new JLabel("Personal Information System", JLabel.CENTER);
		caption.setFont(new Font("Arial", Font.BOLD, 18));
		caption.setForeground(Color.blue);
		this.add(caption, BorderLayout.NORTH);
		
		JPanel pnlLabel = new JPanel(new GridLayout(12,1));
		this.add(pnlLabel, BorderLayout.WEST);
			JLabel lblName = new JLabel("1. Name:");
			JLabel lblGender = new JLabel("2. Gender:");
			JLabel lblParent = new JLabel("3. Parent:");
			JLabel lblInnocu = new JLabel("4. Innoculation:");
			JLabel lblQualif = new JLabel("5. Highest Qualification:");
			JLabel lblLocation = new JLabel("6. Location:");
			JLabel lblMobile = new JLabel("7. Mobile No.:");
			JLabel lblEmail = new JLabel("8. Email-id:");
			pnlLabel.add(new JLabel());
			pnlLabel.add(new JLabel());
			pnlLabel.add(lblName);
			pnlLabel.add(lblGender);
			pnlLabel.add(lblParent);
			pnlLabel.add(lblInnocu);
			pnlLabel.add(lblQualif);
			pnlLabel.add(lblLocation);
			pnlLabel.add(lblMobile);
			pnlLabel.add(lblEmail);
			pnlLabel.add(new JLabel());
			pnlLabel.add(new JLabel());

		JPanel pnlField = new JPanel(new GridLayout(12,1));
		this.add(pnlField, BorderLayout.CENTER);
			tfName = new JTextField();
			tfParent = new JTextField();
			tfLocation = new JTextField();
			tfMobile = new JTextField();
			tfEmail = new JTextField();
			rbMale = new JRadioButton("Male");
			rbFemale = new JRadioButton("Female");
			ckbDPT = new JCheckBox("DPT");
			ckbMesiles = new JCheckBox("Mesiles");
			ckbCovid = new JCheckBox("Covid");
			Vector<String> vQualif = new Vector<String>();
			vQualif.add("Select");
			vQualif.add("High School Certificate");
			vQualif.add("Intermediate");
			vQualif.add("Bachelor Degree");
			vQualif.add("Master Degree");
			vQualif.add("Doctorate");
			cbQualif = new JComboBox<String>(vQualif);
			pnlField.add(new JLabel());
			pnlField.add(new JLabel());
			pnlField.add(tfName);
			JPanel pnlGender = new JPanel(new GridLayout(1,2));
			pnlField.add(pnlGender);
				bgGender = new ButtonGroup();
				bgGender.add(rbMale);
				bgGender.add(rbFemale);
				rbMale.setActionCommand("Male");
				rbFemale.setActionCommand("Female");
				pnlGender.add(rbMale);
				pnlGender.add(rbFemale);
			pnlField.add(tfParent);
			JPanel pnlInnocu = new JPanel(new GridLayout(1,3));
			pnlField.add(pnlInnocu);
				pnlInnocu.add(ckbDPT);
				pnlInnocu.add(ckbMesiles);
				pnlInnocu.add(ckbCovid);
			pnlField.add(cbQualif);
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
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae) {
					String name = tfName.getText();
					String parent = tfParent.getText();
					String location = tfLocation.getText();
					String mobile = tfMobile.getText();
					String email = tfEmail.getText();
					String gender = bgGender.getSelection().getActionCommand();
					String innocu = ckbDPT.getText()+","+ckbMesiles.getText()+","+ckbCovid.getText();
					String qualif = cbQualif.getSelectedItem().toString();
					StringBuffer buf = new StringBuffer();
					buf.append("\""+name+"\"");
					buf.append(",\""+parent+"\"");
					buf.append(",\""+gender+"\"");
					buf.append(",\""+location+"\"");
					buf.append(",\""+innocu+"\"");
					buf.append(",\""+qualif+"\"");
					buf.append(",\""+mobile+"\"");
					buf.append(",\""+email+"\"\r\n");
					System.out.println(buf.toString());
				}
			});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400, 150, 550, 450);
		this.setVisible(true);
	}
	
	public Insets getInsets() {
		return new Insets(50,100,50,100);
	}
	
	public static void main(String[] args) {
		new StudentInfo();
	}
}
