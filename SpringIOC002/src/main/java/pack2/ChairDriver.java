package pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChairDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myconfig.xml");
		Chair c=(Chair) context.getBean("ch");
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getColor());
		System.out.println(c.getPrice());
		
		
	}

}
