package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myconfig.xml");
	//	Student student=(Student) context.getBean("s1");
	//	System.out.println(student);
	}

}
