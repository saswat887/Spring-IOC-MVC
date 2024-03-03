package pack1;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentDriver {
	public static void main(String[] args) {
		ClassPathResource resource=new ClassPathResource("myconfig.xml");
		XmlBeanFactory bean=new XmlBeanFactory(resource);
		Student obj=(Student) bean.getBean("s1");
		Student obj2=(Student) bean.getBean("s2");
		System.out.println(obj);
		System.out.println(obj2);
	}

}
