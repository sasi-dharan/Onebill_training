package com.te.jaxbjson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employe {
@JsonProperty(value= "fullname")	
private String name;
private String designation;
@JsonIgnore
private String locality;
private Company company;
/**
 * @return the company
 */
public Company getCompany() {
	return company;
}
/**
 * @param company the company to set
 */
public void setCompany(Company company) {
	this.company = company;
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
 * @return the locality
 */
public String getLocality() {
	return locality;
}
/**
 * @param locality the locality to set
 */
public void setLocality(String locality) {
	this.locality = locality;
}

}
