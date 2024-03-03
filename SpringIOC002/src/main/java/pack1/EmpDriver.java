package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("myconfig.xml");
		Employee e=(Employee) context.getBean("emp");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());
		
		Employee e1=(Employee) context.getBean("emp2");
		System.out.println(e1.getNumber());
		System.out.println(e1.getAddress());
		System.out.println(e1.getZipcode());
	}

}
