package com.in.out;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KeyboardInput {
	private BufferedReader br;
	private BufferedWriter bw;

	public KeyboardInput() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("student.csv")));

			boolean yn = true;
			String name, father, gender, school, house, blood;

			while(yn) {
				for(int i=0; i<24; i++) System.out.println();
				
				System.out.println("STUDENT INFORMATION SYSTEM");
				System.out.println("--------------------------");
				System.out.print("Candidate's Name: ");
				name = br.readLine();
				System.out.print("Father's Name:    ");
				father = br.readLine();
				System.out.print("Gender [M/F]:     ");
				gender = br.readLine();
				System.out.print("School Name:      ");
				school = br.readLine();
				System.out.print("House Name:       ");
				house = br.readLine();
				System.out.print("Blood Group:      ");
				blood = br.readLine();
				
				StringBuffer buf = new StringBuffer();
				buf.append(name+",");
				buf.append(father+",");
				buf.append(gender+",");
				buf.append(school+",");
				buf.append(house+",");
				buf.append(blood+"\r\n");

				bw.write(buf.toString());
				System.out.println("\r\n\r\n");

				System.out.print("More [Y/N]: ");
				yn = br.readLine().toLowerCase().startsWith("y");
			}

			bw.close();
			br.close();
		} catch(IOException e) {
			
		} catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		new KeyboardInput();
	}

}
