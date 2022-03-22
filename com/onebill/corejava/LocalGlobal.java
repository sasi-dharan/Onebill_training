package com.onebill.corejava;

public class LocalGlobal {
	int a=10;
	static int b=20;
public static void main(String[] args) {
	int c=30;
	System.out.println(c);
	System.out.println(LocalGlobal.b);
	LocalGlobal localglobal=new LocalGlobal();
	
	System.out.println(localglobal.a);
}
}
