package com.onebill.exception;

public class Exercise2 {
	public static void main(String[] args) {
		System.out.println("program start");
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("program ends");
		
	}
	
}