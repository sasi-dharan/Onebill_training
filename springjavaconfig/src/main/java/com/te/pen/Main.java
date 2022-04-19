package com.te.pen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.te.springjavaconfigannotation.Mobile;
import com.te.springjavaconfigannotation.MobileConfiguration;

@Configuration
@ComponentScan(basePackages = {"com.te.pen"})
public class Main {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
	Pen bean = context.getBean(Pen.class);
	bean.write();
}
}
