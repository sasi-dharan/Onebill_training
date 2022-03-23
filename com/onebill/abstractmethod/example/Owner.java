package com.onebill.abstractmethod.example;

public class Owner {
	public static void main(String[] args) {
		Pet p= new Rio();
		p.sound();
		p.food();
		p.play();
		
		Rio rio=(Rio) p;
		rio.fight();
	}

}
