package com.onebill.casting;

public class User {
	String name;
	long number;
	
	public User(String name, long number) {
		this.name= name;
		this.number=number;
	}
	public User() {
		System.out.println("from the user");
	}
	 
	public void chat() {
		System.out.println(name+ " is chatting");
	}
	public void share() {
		System.out.println(name+ " is sharing");
	}
	public void vediocall() {
		System.out.println(name+ " is vedio calling");
	}
	

}
