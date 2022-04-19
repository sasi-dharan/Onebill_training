package Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(NameConfig.class);
		ListofName bean = context.getBean(ListofName.class);
		System.out.println(bean);
	}

}
