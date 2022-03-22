package com.onebill.casting;

public class Admin extends User{
	public Admin(String name,long number) {
		super(name, number);
		System.out.println("from the admin"); 
		
	}
    public void addUser(String usernmae) {
    	System.out.println( usernmae + " added");
    }
    public void removeUser(String usernmae) {
    	System.out.println( usernmae + " removed");
    }
}
