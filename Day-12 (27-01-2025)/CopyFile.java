package com.in.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	private FileInputStream inFile;
	private FileOutputStream outFile;
	
	public CopyFile(String source, String target) {
		try {
			File file = new File(source);
			long fullSize = file.length();
			double size5pc = fullSize * .05;

			inFile = new FileInputStream(source);
			outFile = new FileOutputStream(target);
			
			int each;
			long count = 0;
			while( (each=inFile.read()) != -1 ) {
				outFile.write(each);
				count++;
				if(count>=size5pc) {
					System.out.print(".");
					count = 0;
				}
			}
			
			outFile.close();
			inFile.close();
			
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
			
		}
	}

	public static void main(String[] args) {
		new CopyFile("cf.pdf", "cFile.pdf");
	}

}
