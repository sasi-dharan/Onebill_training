package com.onebill.assignment.mar25.first;
import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int y;
		int []a;
		System.out.println("enter size");
		y= scan.nextInt();
		a= new int [y];
		for (int i = 0; i < a.length; i++) {
			System.out.println("entre the numbers");
			a[i]= scan.nextInt();
		}
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			
			x= x+a[i];
			System.out.println(x);
			
			
		}

}
}