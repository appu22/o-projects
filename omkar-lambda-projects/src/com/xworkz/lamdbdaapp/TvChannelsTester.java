package com.xworkz.lamdbdaapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TvChannelsTester {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Suvarna");
		list.add("UDAY");
		list.add("UDAY MOVIES");
		list.add("Tv9");
		list.add("E TV News");
		list.add("Star Suvarna");

		List<String> collect = list.stream().filter((g) -> g.startsWith("U")).map(c -> c.toLowerCase())
				.collect(Collectors.toList());

		collect.forEach(g -> System.out.println(g));

	}

}
