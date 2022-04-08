package com.te.findmethod;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//use persist to update data whwn the primary key is already present

public class App1 {
public static void main(String[] args) {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("student");
	EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();
	
	Student find = createEntityManager.find(Student.class,1);
	find.setDepartment("mechanical");
	createEntityManager.persist(find);
	
	transaction.begin();
	transaction.commit();
	
}
}
