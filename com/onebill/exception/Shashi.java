package com.onebill.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Shashi {
public String task(File file) throws IOException{
	String s= "";
	FileReader fr= new FileReader(file);
	int x= fr.read();
	while(x!=-1) {
		s+=(char)x;
		x= fr.read();
	}
	return s;
}
}
