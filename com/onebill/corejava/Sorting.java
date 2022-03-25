package com.onebill.corejava;
import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		int y;
		Scanner scan= new Scanner(System.in);
		y= scan.nextInt();
		int[] a;
		a= new int[y];
		int i,j,n, temp;
		n= a.length;
		for ( i = 0; i < n; i++) {
			System.out.println("enter the" +(i+1)+ "number");
			a[i]= scan.nextInt();
		}
		
		
		for (i = 0; i < n; i++) {
			for (j = i+1; j <n; j++) {
				if(a[i]> a[j]) {
					temp= a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
		
		for ( i = 0; i < n; i++) {
			
			System.out.println(a[i]);
		}
		
	}

}
