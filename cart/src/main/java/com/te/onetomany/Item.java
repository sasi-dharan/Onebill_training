package com.te.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Item {
	@Id
 private int id;
 private String category;
 private String productname;
 private double productprice;
 private double productrating;
 private int quantity;
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public Item(int id, String category, String productname, double productprice, double productrating, int quantity) {
	super();
	this.id = id;
	this.category = category;
	this.productname = productname;
	this.productprice = productprice;
	this.productrating = productrating;
	this.quantity = quantity;
}
/**
 * @return the id
 */
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
 * @return the category
 */
public String getCategory() {
	return category;
}
/**
 * @param category the category to set
 */
public void setCategory(String category) {
	this.category = category;
}
/**
 * @return the productname
 */
public String getProductname() {
	return productname;
}
/**
 * @param productname the productname to set
 */
public void setProductname(String productname) {
	this.productname = productname;
}
/**
 * @return the productprice
 */
public double getProductprice() {
	return productprice;
}
/**
 * @param productprice the productprice to set
 */
public void setProductprice(double productprice) {
	this.productprice = productprice;
}
/**
 * @return the productrating
 */
public double getProductrating() {
	return productrating;
}
/**
 * @param productrating the productrating to set
 */
public void setProductrating(double productrating) {
	this.productrating = productrating;
}
/**
 * @return the quantity
 */
public int getQuantity() {
	return quantity;
}
/**
 * @param quantity the quantity to set
 */
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
 
 
 
 
}
