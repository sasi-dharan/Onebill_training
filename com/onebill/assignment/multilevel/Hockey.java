package com.onebill.assignment.multilevel;

public class Hockey {
	int members;
	int squad;
	
	public Hockey() {
		System.out.println("from the superclass");
	}
	public Hockey(int members,int squad) {
		//members=m;
		//squad=s;
		this.members=members;
		this.squad=squad;
}
}