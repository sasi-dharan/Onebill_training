package com.onebill.inheritance;

public class store1 {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone(20000,2,34.1,4);
		
		
		System.out.println(smartPhone.ram);
		System.out.println(smartPhone.prise);
		System.out.println(smartPhone.cameracount);
		/*if u call the subclass the superclass is called automaticaly*/
	}

}
