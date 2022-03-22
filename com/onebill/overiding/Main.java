package com.onebill.overiding;

public class Main {
	public static void main(String[] args) {
		Test2 test= new Test2();
		
		System.out.println(test.add(10, 20));
		test.message();
	}

}
