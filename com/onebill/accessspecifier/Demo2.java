package com.onebill.accessspecifier;

public class Demo2 {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.m1();
		//demo.m2(); it can accessed only with in a class
		demo.m3();  //
		demo.m4();
		
		
		System.out.println(demo.a);
		//System.out.println(demo.b);
		System.out.println(demo.c);
		System.out.println(demo.d);
		
	}

}
