package com.onebill.inheritance;

public class SmartPhone extends Phone {
	
	double camera;
	int cameracount;
	
	public SmartPhone() {
		System.out.println("for samsung to take values");
	}
	
	
	public SmartPhone(int prise, int ram, double c, int cam){
		super(prise, ram);
		camera=c;
		cameracount=cam;
	System.out.println("from subclass");
    }
	public SmartPhone(int prise, int ram){
		super(prise, ram);	
	}
	public SmartPhone(int prise, int ram,int cam){
		super(prise, ram);
		cameracount=cam;
		
	}
	public void play() {
		System.out.println("playing pubg");
	}
	public void selfie() {
		System.out.println("got a picture");
	}

}
