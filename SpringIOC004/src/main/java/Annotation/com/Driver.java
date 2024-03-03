package Annotation.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ann.xml");
		Remote r=context.getBean(Remote.class);
		Tv t=context.getBean(Tv.class);
		
		System.out.println(r);
		System.out.println(t);
	}

}
