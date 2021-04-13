package com.xworkz.lamdbdaapp;

import java.util.HashSet;
import java.util.Set;

public class NationalForest {
	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<String>();
		System.out.println("-------------List of National Forest--------------");
		set.add("Gir Forest National Park");
		set.add("Gorumara National Park");
		set.add("Govind Pashu Vihar National Park");
		set.add("Gir Forest National Park");
		set.add("Great Himalayan National Park");
		set.add("Kuno National Park");
		set.add("Bandipur National Park");
		set.add("Gangotri National Park");
		set.add("Gorumara National Park");
		set.add("Guindy National Park");
		
		set.stream().filter((d)->d.startsWith("G")).forEach(v->System.out.println(v));
		
		
		System.out.println("\n-----------------Print all -----------");
		set.forEach(s->System.out.println(s));
		System.out.println("\n--------starting letter with  G chatacters  -----------");
		set.stream().filter((d)->d.startsWith("G")).map(g->g.length())
		.forEach(v->System.out.println(v));
	
	}

}
