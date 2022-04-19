package com.te.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext Context=new AnnotationConfigApplicationContext(Config.class);
       Car bean = Context.getBean("audi",Car.class);
       System.out.println(bean);
    }
}
