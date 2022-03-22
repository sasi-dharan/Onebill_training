package com.onebill.inheritance;

public class Phone {
	int ram;
	int prise;
	
	public Phone() {
		System.out.println("from the superclass");
	}
	public Phone(int p,int r) {
		prise=p;
		ram=r;
		
		
	}
	public void call() {
		System.out.println("calling");
	}
	public void radio() {
		System.out.println("listening");
	}
	public void message(String msg) {
		System.out.println(msg);
	}

}
