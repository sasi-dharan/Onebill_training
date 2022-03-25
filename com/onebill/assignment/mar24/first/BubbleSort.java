package com.onebill.assignment.mar24.first;

import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int y;
	System.out.println("enter size of array");
	y=scan.nextInt();
	int[] a;
	a=new int[y];
	int n=a.length;
	int temp,i,j;
	for(i=0;i<n;i++) {
		System.out.println("enter "+(i+1)+" number");
		a[i]=scan.nextInt();
	}
	
	
	for ( i = 0; i < n; i++) {
		for ( j = i+1; j <n ; j++) {
			if(a[i]<a[j]) {
				temp= a[i];
				a[i]= a[j];
				a[j]= temp;
				
			}
		}
	}
	for( i = 0; i < n; i++) {
		System.out.println(a[i]);
	}
    }
}
