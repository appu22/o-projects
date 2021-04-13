package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.olympic.OlympicDto;

public class OlympicTester {

	public static void main(String[] args) {

		OlympicDto dto = new OlympicDto("Appu", "India", 2012, true);
		OlympicDto dto1 = new OlympicDto("Appu", "India", 2012, true);

		if (dto.equals("y"))
		{
			System.out.println("is equal");
		}else {
			System.out.println("not equal");
		}

	}

}
