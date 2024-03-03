package pack1;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;


public class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
	private List<Integer> number;
	private Set<String> address;
	private Map<String, Integer> zipcode;
	public List<Integer> getNumber() {
		return number;
	}
	public void setNumber(List<Integer> number) {
		this.number = number;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, Integer> getZipcode() {
		return zipcode;
	}
	public void setZipcode(Map<String, Integer> zipcode) {
		this.zipcode = zipcode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
