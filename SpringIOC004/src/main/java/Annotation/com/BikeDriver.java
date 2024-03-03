package Annotation.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ann.xml");
		Bike b=context.getBean(Bike.class);
		System.out.println(b.getEngine());
		System.out.println(b.getEngine().getId());
	}

}
