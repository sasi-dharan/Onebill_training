package com.te.findmethod;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Student student = new Student(2, "sd", 35, "CS");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("student");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		//to add data
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		createEntityManager.persist(student);
//		transaction.begin();
//		transaction.commit();
		
		//to get data
//		Student get = createEntityManager.find(Student.class, 1);
//		System.out.println(get);
//		Student reference = createEntityManager.getReference(Student.class, 2);
//		System.out.println(reference);
		
		//to remove data
//		Student merge = createEntityManager.merge(student);
//		createEntityManager.remove(merge);
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		transaction.begin();
//		transaction.commit();
	}
}