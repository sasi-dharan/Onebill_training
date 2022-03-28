package com.onebill.assignment.mar25.third;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y;
		System.out.println("enter the size");
		y = scan.nextInt();
		int a[];
		a= new int[y];
		try{for (int i = 0; i < a.length; i++) {
			System.out.println("enter the numbers");
			a[i]=scan.nextInt();	 
			}
		
		for (int i = 0; i <2; i++) {
			System.out.println(a[i]);
		}
		}catch(InputMismatchException e){
			System.out.println("invalid input");
		}
	}

}
