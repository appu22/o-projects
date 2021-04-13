package com.xworkz.lamdbdaapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VirusTester {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();

		list.add("Adeno-associated virus");
		list.add("Aichi virus");
		list.add("Australian bat lyssavirus");
		list.add("COVID19");
		list.add("Banna virus");
		list.add("ChikenGunny");
		list.add("Dengue virus");
		list.add("Marburg virus");
		list.add("H1N1 virus");
		
		int hashCode = list.stream().hashCode();
		System.out.println(hashCode);
	
		List<String> collect = list.stream()
				.filter((e)->e.startsWith("A"))
				.collect(Collectors.toList());
		
			collect.forEach(f->System.out.println(f));
	}

}
