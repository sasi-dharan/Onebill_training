package com.te.springjavaconfigannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Mobile {
	@Value(value= "shashi")
	String name;
	@Value(value="realme")
	String brand;
	@Value(value="13040")
	double price;
	@Autowired
	Sim sim;
}
