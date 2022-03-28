package com.onebill.assignment.mar25.fourth;

import java.util.Scanner;

public class fourth {

public static Boolean CallMethod(int[] x) {
	int count =0;
	
	for (int i = 0; i < x.length; i++) {
		if(x[i]==3) {
			count++;
		}
		if(i+1<x.length) {
			if (x[i]==3 && x[i+1]==3 ) {return false;}
		}
	}
	if(count==3) {return  true;}
	else {return  false;}
}
	
	
	
	
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int y;
	System.out.println("enter the size");
	y = scan.nextInt();
	int a[];
	a= new int[y];
	    for (int i = 0; i < a.length; i++) {
		System.out.println("enter the numbers");
		a[i]=scan.nextInt();
		}
	
	    System.out.println(fourth.CallMethod(a));
}
}
