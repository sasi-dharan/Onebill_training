package com.onebill.corejava;

public class conditionalStatement {
	public static void main(String[] args) {
//	if(true) {
//		System.out.println("it will execute");
//	}
//	int x=2;
//	int y=4;
//	if (x<y) {
//		System.out.println("hello");
//	}else {
//		System.out.println("welcome");
//	}
   
		
		
//	int u=700;
//	if (u>8000 && u<9000) {
//		System.out.println("lets go to goa");
//	}else if (u>9000 && u<1000) {
//		System.out.println("lets go to pondy");
//	}else if (u>1000 && u<11000) {
//		System.out.println("lets go to kerala");	
//	}else {
//		System.out.println("be in home");
//	}

		
		
		
		int u = 9;
		switch (u) {
		case 1:
			System.out.println("go to delhi");
			break;
		case 2:
			System.out.println("go to goa");
			break;
		case 3:
			System.out.println("go to pondy");
			break;
		case 4:
			System.out.println("go to kerala");
			break;
		default:
			System.out.println("stay home");
		}
	}
}
