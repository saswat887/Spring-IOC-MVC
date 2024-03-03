package pack3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("myconfig.xml");
		Human h=(Human) a.getBean("humanObj");
		System.out.println(h);
		System.out.println(h.getHeart());
	}

}
