package Annotation.com;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Tv {
	{
		System.out.println("TV object created");
	}

}
