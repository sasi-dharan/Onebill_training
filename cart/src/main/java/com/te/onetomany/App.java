package com.te.onetomany;

//import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
       Cart cart = new Cart();
       
       //1 st
       Item item = new Item();
       item.setId(4);
       item.setCategory("phone");
       item.setProductname("realme");
       item.setProductprice(10000);
       item.setProductrating(5);
       item.setQuantity(1);
       
     //2 st
       Item item2= new Item();
       item2.setId(6);
       item2.setCategory("lap");
       item2.setProductname("Dell");
       item2.setProductprice(150000);
       item2.setProductrating(4);
       item2.setQuantity(2);
       
       cart.setItem(Arrays.asList(item,item2));
       
       EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("factory");
       EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
       EntityTransaction transaction = createEntityManager.getTransaction();
       transaction.begin();
       createEntityManager.persist(cart);
       transaction.commit();
       
    }
}
