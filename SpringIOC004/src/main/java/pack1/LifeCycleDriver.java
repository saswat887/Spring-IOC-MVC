package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleDriver {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		LifeCycle bean=(LifeCycle) context.getBean("life");
		context.registerShutdownHook();
		System.out.println(bean);
		System.out.println(bean);
	}

}
