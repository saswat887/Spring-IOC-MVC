package com.org;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cap {
	{
		System.out.println("Cap object created");
	}

}
