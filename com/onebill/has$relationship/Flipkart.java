package com.onebill.has$relationship;

public class Flipkart {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		Battery battery = new Battery();
		battery.brand= "dell";
		battery.capacity=20000;
		battery.type= "lithium";
		
		Rom rom = new Rom();
		rom.clockspeed= 2.4;
		rom.size= 16;
		rom.type= "DDR4";
		
		Screen screen = new Screen();
		screen.brand= "samsung";
		screen.resolution=1080;
		screen.size= 14;
		screen.type="oled";
		
		laptop.name="HP";
		laptop.price= 50000;
		laptop.battery= battery;
		laptop.screen= screen;
		laptop.rom= rom;
		
		
		
		System.out.println(laptop);
	}

}
