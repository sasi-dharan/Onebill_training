package com.onebill.assignment.multilevel;

public class Hockey {
	int members;
	int squad;
	
	public Hockey() {
		System.out.println("from the superclass");
	}
	public Hockey(int m,int s) {
		members=m;
		squad=s;
}
}