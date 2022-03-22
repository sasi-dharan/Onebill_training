package com.onebill.overiding;

public class Owner {
	
	public static void main(String[] args) {
		 Ferrari ferrari = new Ferrari();
		 ferrari.drive();
		 ferrari.brake();
		 ferrari.horn();
		 
		 
		 Audi audi= new Audi();
		 audi.drive();
		 audi.brake();
		 audi.horn();
		 
	}

}
