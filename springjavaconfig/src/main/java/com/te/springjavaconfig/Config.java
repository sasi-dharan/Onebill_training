package com.te.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {

	@Bean(name = "audi", autowire = Autowire.BY_NAME)
	public Car getCar(/*Owner owner*/) {
		Car car = new Car();
		car.setName("audi");
		car.setModel("a4");
		car.setPrice(1000000);
		//car.setOwner(owner);
		return car;
	}

	@Bean(name = "bmw")
	public Car getCar1() {
		Car car1 = new Car();
		car1.setName("bmw");
		car1.setModel("s8");
		car1.setPrice(8000000);
		return car1;
	}

	@Bean()
	public Owner getOwner() {
		Owner owner = new Owner();
		owner.setAge(34);
		owner.setHometown("USA");
		owner.setName("znyder");
		return owner;

	}
	@Bean(name = "owner")
//	@Primary
	public Owner getOwner1() {
		Owner owner1 = new Owner();
		owner1.setAge(30);
		owner1.setHometown("usa");
		owner1.setName("zimmer");
		return owner1;

	}
}
