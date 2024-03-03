package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonDao {
	static List<Person1> list=new ArrayList<Person1>();
	static {
		list.add(new Person1("Dimbaka", 20, "dimbak@gmail.com", "123"));
		list.add(new Person1("Dim", 22, "dim@gmail.com", "123"));
		list.add(new Person1("Dimbaki", 29, "dimbaki@gmail.com", "123"));
		list.add(new Person1("Saswat", 24, "saswat@gmail.com", "123"));
		list.add(new Person1("Piyus", 27, "piyush@gmail.com", "123"));
	}
	public List<Person1> fetchAllPerson() {
		return list;
	}

}
