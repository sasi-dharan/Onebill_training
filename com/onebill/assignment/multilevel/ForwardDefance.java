package com.onebill.assignment.multilevel;

public class ForwardDefance extends Hockey {
	int noOfForward;
	int noOfDefence;
	
	public ForwardDefance() {
		
	}
	
	
	public ForwardDefance(int members, int squad, int f, int d){
		super(members, squad);
		noOfForward=f;
		noOfDefence=d;
	
    }
}
