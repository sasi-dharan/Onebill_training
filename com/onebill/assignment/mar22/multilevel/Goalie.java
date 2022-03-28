package com.onebill.assignment.mar22.multilevel;

public class Goalie extends ForwardDefance{
	String preference;
	int noOfGoalieinSquad;
	public Goalie(int members, int squad, int f, int d, String preference, int noOfGoalieinSquad ){
		super(members, squad, f, d);
		//preference=s;
		//noOfGoalieinSquad=g;
		this.preference=preference;
		this.noOfGoalieinSquad=noOfGoalieinSquad;
		
		

}
}