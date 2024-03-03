package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Marker {
	{
		System.out.println("Marker object created");
	}
	@Autowired
	private Cap cap;

}
