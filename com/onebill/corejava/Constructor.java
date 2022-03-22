package com.onebill.corejava;

public class Constructor {
//	Constructor(){
//	System.out.println("hi");
//	}
	public static void main(String[] args) {
//		Constructor contrt=new Constructor();
//		Meth.multiple(1,2);
		
		
		
		
	Meth a=new Meth();
	System.out.println(a.x);
	System.out.println(Meth.y);
	System.out.println(a.y);
	a.multiple(6, 7.8);
	}

}
