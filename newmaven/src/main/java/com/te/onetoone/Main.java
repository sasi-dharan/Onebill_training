package com.te.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	Trainee trainee = new Trainee();
	trainee.setName("Sd");
	trainee.setSalary(30000);
	trainee.setDesignation("trainee");
	
	Laptop laptop = new Laptop();
	laptop.setBattery("duracell");
	laptop.setBrand("dell");
	laptop.setId(101);
	laptop.setRom("1 tb");
	trainee.setLaptop(laptop);
    laptop.setTrainee(trainee);
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("factor");
	EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();
	transaction.begin();
	createEntityManager.persist(laptop);
	//createEntityManager.persist(trainee);
	transaction.commit();
	
	
}
}
