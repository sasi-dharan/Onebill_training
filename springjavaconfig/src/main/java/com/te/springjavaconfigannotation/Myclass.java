package com.te.springjavaconfigannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Myclass {
	@SuppressWarnings("resource")
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);
	Mobile bean = context.getBean(Mobile.class);
	System.out.println(bean);
}
}
