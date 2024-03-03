package Annotation.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonPanDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ann.xml");
		Person p=context.getBean(Person.class);
		System.out.println(p.getPan().getPanid());
	}
}
/*
 * 1.Registration Form
 * 2.Login
 * 3.Welcome Homes
 * Webinf->classes->metainf
 * 
 */
