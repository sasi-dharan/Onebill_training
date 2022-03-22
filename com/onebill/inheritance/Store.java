package com.onebill.inheritance;

public class Store {
	public static void main(String[] args) {
		
		
		
	/*	Phone phone=new Phone();
		phone.price=2000;
		phone.ram=4;
		phone.brand="nokia";
		
		phone.call();
		phone.message("hi dear");
		phone.radio();
		
		System.out.println("===========");
		
		SmartPhone smartphone= new SmartPhone();
		smartphone.ram=8;
		smartphone.brand="apple";
		smartphone.price=10000;
		smartphone.camera=12.6;
		smartphone.cameracount=3;
		
		smartphone.call();
		smartphone.play();
		smartphone.selfie();
		smartphone.message("hi dear");
		smartphone.radio(); */
		
		
		Samsung samsung= new Samsung();
		 samsung.SpecialFeature= "it can tap";
		 samsung.Model= "M51";
		 samsung.camera= 64.1;
		 samsung.prise= 100000;
		 samsung.play();
		
		
		Apple apple=new Apple(); 
		apple.os= "special";    
		
		Phone phone = new Phone(12000, 3);
		System.out.println(phone.prise);
		System.out.println(phone.ram);
		
		
		Phone phone1 = new Phone(14000, 4);
		System.out.println(phone1.prise);
		System.out.println(phone1.ram);
		
		
		
	
	}

}
