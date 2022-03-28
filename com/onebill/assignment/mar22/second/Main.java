package com.onebill.assignment.mar22.second;

public class Main {
	public static void main(String[] args) {
		Manager manager= new Manager("harish", 25, 1234567890, "1st cross street", 30000,"HR");
		
		Employee employee= new Employee("aruveen", 32, 1234567890, "2nd cross street", 20000,"testing");
		System.out.println(employee.specialization);
	}

}
