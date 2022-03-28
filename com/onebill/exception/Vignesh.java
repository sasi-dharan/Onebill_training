package com.onebill.exception;

import java.io.File;
import java.io.IOException;

public class Vignesh {
public static void main(String[] args) {
	Shashi shashi= new Shashi();
	File file= new File("C:\\Users\\HP\\Desktop\\javis\\com\\onebill\\exception\\file");
	String task1;
	try {
		task1= shashi.task(file);
		System.out.println(task1);
	}catch (IOException e) {
		e.printStackTrace();
	}
}
}
