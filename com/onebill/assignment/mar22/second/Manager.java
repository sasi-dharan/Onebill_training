package com.onebill.assignment.mar22.second;

public class Manager extends Member{
	String department;

	public Manager(String Name, int Age, long Phonenumber, String Address,long Salary, String department) {
		super(Name,Age,Phonenumber,Address, Salary);
		System.out.println(department);
}
}
