package com.te.manytomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		User rajjan = new User();
		rajjan.setMailId("rajjan@gmail.com");
		rajjan.setName("rajjan");
		rajjan.setPassword("hjzdgljhxczv");

		User shashi = new User();
		shashi.setMailId("shashi@gmail.com");
		shashi.setName("shashi");
		shashi.setPassword("hshdgclsj");

		Application telegram = new Application();
		telegram.setId(1);
		telegram.setName("telegram");
		telegram.setCategory("social");

		Application insta = new Application();
		insta.setId(2);
		insta.setName("insta");
		insta.setCategory("social");

		shashi.setApps(Arrays.asList(telegram, insta));
		rajjan.setApps(Arrays.asList(telegram, insta));
		telegram.setUser(Arrays.asList(shashi, rajjan));
		insta.setUser(Arrays.asList(shashi, rajjan));

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("many");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		createEntityManager.persist(shashi);
		createEntityManager.persist(rajjan);
		transaction.commit();

	}
}
