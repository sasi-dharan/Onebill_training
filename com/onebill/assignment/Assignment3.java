package com.onebill.assignment;
import java.util.*;
public class Assignment3 {
	 static void CallBack(int x, int y,int z) {
		int sum;
		for (int i = 0; i < z ; i++) {
			int result=0;
			for (int j = 0; j <=i ; j++) {
				result= (int) (result + (Math.pow(2, j)*y));	
			}
			sum= result+x;
			System.out.println(sum +",");
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value of a");
		int a= scan.nextInt();
		System.out.println("enter value of b");
		int b= scan.nextInt();
		System.out.println("enter value of c");
		int c= scan.nextInt();
		CallBack(a,b,c);
	}

}
