package com.onebill.assignment.multilevel;

public class Goalie extends ForwardDefance{
	String preference;
	int noOfGoalieinSquad;
	public Goalie(int members, int squad, int f, int d, String s, int g ){
		super(members, squad, f, d);
		preference=s;
		noOfGoalieinSquad=g;
		
		
		

}
}