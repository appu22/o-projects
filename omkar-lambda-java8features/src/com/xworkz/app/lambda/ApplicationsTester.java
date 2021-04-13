package com.xworkz.app.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ApplicationsTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		List<String> apps = new ArrayList<String>();
		apps.add("Eclipse ");
		apps.add("news");
		apps.add("Microsoft");
		apps.add("Mozila");
		apps.add("Google");
		apps.add("Internet Explore");

		apps.add("Eclipse ");
		apps.add("MicroSoftOffice");
		apps.add("Chrome");

		Set<String> set = apps.stream().filter((i) -> i.contains("M")).map((e) -> e.toLowerCase())
				.collect(Collectors.toSet());

		set.forEach((e) -> System.out.println(e));

//		list.stream().filter(i -> i.endsWith("M")).map(c -> c.toLowerCase()).collect(Collectors.toList())
//		.forEach(e -> System.out.println(e));

	}

}
