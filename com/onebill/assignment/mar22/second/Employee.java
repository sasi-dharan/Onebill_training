package com.onebill.assignment.mar22.second;

public class Employee extends Member {
String specialization;

public Employee(String Name, int Age, long Phonenumber, String Address,long Salary, String specialization) {
	super(Name,Age,Phonenumber,Address, Salary);
	//System.out.println(specialization);
	this.specialization=specialization;
}
}
