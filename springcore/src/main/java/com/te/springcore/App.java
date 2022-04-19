package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
@SuppressWarnings("resource")
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    GirlFriend bean = context.getBean("girl1", GirlFriend.class);
    System.out.println(bean);
}
}
