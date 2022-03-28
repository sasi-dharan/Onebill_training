package com.onebill.assignment.mar22.multilevel;

public class ForwardDefance extends Hockey {
	int noOfForward;
	int noOfDefence;
	
	public ForwardDefance() {
		
	}
	
	
	public ForwardDefance(int members, int squad, int noOfForward, int noOfDefence){
		super(members, squad);
		//noOfForward=f;
		//noOfDefence=d;
		this.noOfForward=noOfForward;
		this.noOfDefence=noOfDefence;
	
    }
}
