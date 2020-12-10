package com.javaex.ex03;

public class Person {
	//field
	private String name;
	private String hp;
	private String company;
	
	//constructor
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}

	public Person() {
	}
	//method g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	//method
	
	public void draw() {
		System.out.println("이름: "+name);
		System.out.println("핸드폰: "+ hp);
		System.out.println("회사: "+company);
		System.out.println();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	
	
	
	
}
