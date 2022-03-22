package com.onebill.corejava;


public class Meth {
	int x =110;
	static int y= 20;
	static void multiple(double x, double y) {
		double c = x + y;
		System.out.println(c);	
	}
	static void multiple(int x, int y) {
		int c = x + y;
		System.out.println(c);	
	}
	static void multiple(int x, double y) {
		double c = x + y;
		System.out.println(c);	
	}
	static void multiple(double x, int y) {
		double c = x + y;
		System.out.println(c);	
	}
	public static void main(String[] args) {
		 multiple(7.5, 7);
		 
		
	}
}
