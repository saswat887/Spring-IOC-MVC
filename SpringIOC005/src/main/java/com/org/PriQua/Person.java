package com.org.PriQua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Qualifier("butterscotch")
	IceCream icecream;

}
