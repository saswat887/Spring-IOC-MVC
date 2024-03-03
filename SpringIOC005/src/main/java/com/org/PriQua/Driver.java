package com.org.PriQua;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Person p=context.getBean(Person.class);
		System.out.println(p.icecream);
		
		Employee e=context.getBean(Employee.class);
		System.out.println(e);
		
		Jspyder j=context.getBean(Jspyder.class);
		System.out.println(j.emp);
	}

}
