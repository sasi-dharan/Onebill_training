package com.onebill.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Checked {
public static void main(String[] args) {
	System.out.println("program starts");
	File file= new File("C:\\Users\\HP\\Desktop\\javis\\com\\onebill\\exception\\file");
	try {
		FileReader fr= new FileReader(file);
		int read= fr.read();
		while(read!=-1) {
			System.out.print((char)read);
			read= fr.read();
		}
	}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file not exist");
		}catch(IOException e) {
			System.out.println("no data exist ");
		}
		System.out.println("\n program  ends");
	
	
}	

}
