package Annotation.com;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Remote {
	{
		System.out.println("Remote Object Created");
	}
}
