package com.te.hibernet;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employe employe = new Employe(1, " sd", 34999, "trainee");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("employe");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
//       EntityTransaction transaction = createEntityManager.getTransaction();
//       createEntityManager.persist(employe);
//       transaction.begin();
//       transaction.commit();
//       Query createQuery = createEntityManager.createQuery("from Employe");
//       List <Employe>resultList = createQuery.getResultList();
//       for (Employe employe2 : resultList) {
//		System.out.println(employe2.getSalary());
//	}
//       Query createQuery = createEntityManager.createQuery("select count(*) from Employe");   
//       Object singleResult = createQuery.getSingleResult();
		int x;
		x = scanner.nextInt();
		Query createQuery = createEntityManager.createQuery("select name from Employe where id=:number");
		createQuery.setParameter("number", x);
		Object singleResult = createQuery.getSingleResult();
		System.out.println(singleResult);
	}
}
