package com.onebill.corejava;

public class Recursion {
	 static int add(int k) {
		if(k>0) {
			return k+add(k-1);
		}else 
		{ 
			return 0;
		}
		}
		
public static void main(String[] args) {
	int result= add(20);
	System.out.println(result);
}
}
