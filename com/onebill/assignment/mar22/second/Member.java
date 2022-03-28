package com.onebill.assignment.mar22.second;

public class Member {
	
	String Name;
	int Age;
	long Phonenumber;
	String Address;
	long Salary;

	public void PrintSalary(long Salary){
		System.out.println("the salary is"+ Salary);
	}
	
	public Member(String Name, int Age, long Phonenumber, String Address,long Salary) {
		System.out.println("name:"+ Name);
		System.out.println("age:"+ Age);
		System.out.println("phonenumber:"+ Phonenumber);
		System.out.println("address:"+ Address);
		System.out.println("salary:"+ Salary);
	}
	}



