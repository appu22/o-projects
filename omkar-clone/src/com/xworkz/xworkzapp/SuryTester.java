package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.olympic.OlympicDto2;

public class SuryTester {
	public static void main(String[] args) throws CloneNotSupportedException {

		OlympicDto2 dto = new OlympicDto2("grcee", "2019");

		System.out.println(dto.hashCode());

		
		Object object = (Object)dto.clone();
		OlympicDto2 dto2 = (OlympicDto2) object;
		

		System.out.println(dto2.getName());
		System.out.println(dto2.getYear()); 
		
		if (dto.equals(dto2)) {
			System.out.println("********equal");
		}else
			System.out.println("not equal");

	}
}
