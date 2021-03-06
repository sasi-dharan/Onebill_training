package com.te.hibernet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
private int id;
private String name;
private double salary;
private String designation;

public Employe() {
	
}



public Employe(int id, String name, double salary, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}



@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
}


}
