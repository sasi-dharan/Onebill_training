package com.onebill.assignment.mar22.multilevel;


public class Main {
	public static void main(String[] args) {
	ForwardDefance forwarddefance = new ForwardDefance(11,18,5,6);
	//System.out.println(forwarddefance.noOfForward);
	//System.out.println(forwarddefance.noOfDefence);
	
	Goalie goalie = new Goalie(11, 18,5,6,"can use goalie preference",1);
	System.out.println(goalie.members);
	System.out.println(goalie.squad);
	System.out.println(goalie.noOfForward);
	System.out.println(goalie.noOfDefence);
	System.out.println(goalie.preference);
	System.out.println(goalie.noOfGoalieinSquad);
	
	

}
}
	