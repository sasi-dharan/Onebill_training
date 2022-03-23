package com.onebill.interfacemethod;

public class Person {
	public static void main(String[] args) {
		Calculator calculator=new Citizen();
		System.out.println( calculator.add(1, 2));
	    System.out.println(calculator.sub(1, 2));
	    System.out.println(	calculator.mul(1, 2));
	    System.out.println(	calculator.div(1, 2));
	}

}
