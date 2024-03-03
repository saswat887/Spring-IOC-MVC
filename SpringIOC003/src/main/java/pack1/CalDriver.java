package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalDriver {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("myconfig.xml");
		
	}

}
