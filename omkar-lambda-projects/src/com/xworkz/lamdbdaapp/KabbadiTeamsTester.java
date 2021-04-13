package com.xworkz.lamdbdaapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KabbadiTeamsTester {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Bengaluru Bulls");
		list.add("Mumbai Volley");
		list.add("Patna pirates");
		list.add("Jaipur Pink");

		list.add("Bengal Warriors");
		list.add("Gujarat Fortune Giants");

		list.add("Haryana Steelers");
		list.add("Patna Pirates");

		list.add("Patna pirates");
		list.add("telugu Titans");
		list.add("telugu Titans");

//		list.stream().filter((e)->e.concat("P").equals(list)).forEach(v->System.out.println(v));
		List<String> collect = list.stream().filter((e) -> e.startsWith("t")).map(d -> d.toUpperCase())
				.collect(Collectors.toList());
		collect.forEach(d -> System.out.println(d));

		Stream<String> map = collect.stream().map(c -> c.toString().toLowerCase());
		map.forEach(d -> System.out.println(d));

	}

}
