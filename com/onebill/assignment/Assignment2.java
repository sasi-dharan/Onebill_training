package com.onebill.assignment;
import java.util.*;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.println("enter the length of table");
		int a= scan.nextInt();
		System.out.println("enter the table");
		int y= scan.nextInt();
		 
		for(x=1;x<=a;x++) {
			int z=x*y;
			System.out.println(x+"*"+y+"="+z);
		
		}
	}

}
