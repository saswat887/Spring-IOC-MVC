package Annotation.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MarkerDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ann.xml");
		System.out.println("Marker Output--------------------------------------");
		Marker m1=context.getBean(Marker.class);
		System.out.println(m1.getId());
		System.out.println(m1.getName());
		System.out.println(m1.getPrice());
		System.out.println("Marker1 Output---------------------------------------");
		Marker1 m2=context.getBean(Marker1.class);
		System.out.println(m2.getId());
		System.out.println(m2.getName());
		System.out.println(m2.getPrice());
		System.out.println("Marker2 Output----------------------------------------");
		Marker2 m3=context.getBean(Marker2.class);
		System.out.println(m3.getId());
		System.out.println(m3.getName());
		System.out.println(m3.getPrice());
	}
}
