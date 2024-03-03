package com.org;

public class Person1 {
	private String name;
	private int age;
	private String email;
	private String pwd;
	
	public Person1() {
		
	}
	public Person1(String name, int age, String email, String pwd) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
