package com.xworkz.lamdbdaapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlacesTester {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Malleshwaram");
		list.add("Rajajinagar");
		list.add("Vijanagar");
		list.add("Banashnakari");
		list.add("Marathahalli");
		list.add("Pinya");
		list.add("Jalahalli");
		list.add("Hebbal");
		list.add("AtiGuppe");
		list.add("HosaHalliMetro");
		list.add("KuvempuNagar");
		
		
			List<String>li = list.stream()
					.filter(e->e.startsWith("M"))
					.collect(Collectors.toList());
			
			li.forEach(e->System.out.println(e));
		
	}

}
