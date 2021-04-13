package com.xworkz.xworkzapp.dto;

//encapsulation
public class Person {

	private String name="Appu";
	private int age=20;
	private double salary=25000.0;
	

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}
	public void person() {
		
		System.out.println("Person is a Employee ");
	}

}
