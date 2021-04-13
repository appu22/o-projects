package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.dto.Person;

public class PersonTester {

	public static void main(String[] args) {
		
		Person person = new Person();
		//data read only  
		System.out.println("No one can make changes my peronal details  ");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getSalary());
		
		//data read and write Age only
		person.setAge(24);
		System.out.println("Others can edited this "+person.getAge());

	}

}
