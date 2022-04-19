package com.te.springjavaconfig;

import lombok.Data;

@Data
public class Car {
private String name;
private String model;
private double price;
private Owner owner;
}
