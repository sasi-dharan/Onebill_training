package com.te.jaxb;


import javax.xml.bind.annotation.*;

@XmlRootElement
public class Employe {
int id;
String designation;
String name;
double salary;
String password;
Address add;



/**
 * @return the password
 */
@XmlTransient
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the id
 */
@XmlAttribute( name = "emp-id")
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the designation
 */
public String getDesignation() {
	return designation;
}
/**
 * @param designation the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}

/**
 * @return the add
 */
public Address getAdd() {
	return add;
}
/**
 * @param add the add to set
 */
public void setAdd(Address add) {
	this.add = add;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", designation=" + designation + ", name=" + name + ", salary=" + salary
			+ ", password=" + password + ", add=" + add + "]";
}


}
