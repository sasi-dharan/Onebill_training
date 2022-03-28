package com.onebill.exception.licence;


public class RtoOffice {
	
	private int age;
	private String Name;
	public void licence(String  Name, int age) {
		this.Name= Name;
		this.age= age;
		
		System.out.println("Name:"+ Name);
		System.out.println("Age:"+ age);
		
		if(age>18) {
			System.out.println("you are eligible");
		}else {
			try {
				throw new BelowAgeException(/*"under age"*/);
			}catch(BelowAgeException e){
				System.out.println(/*e.getMessage()*/"under age");
			}
		}
		
		
	}
	
}