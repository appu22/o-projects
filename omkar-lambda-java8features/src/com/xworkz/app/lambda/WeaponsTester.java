package com.xworkz.app.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeaponsTester {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Grenade");
		list.add("AK 47");
		list.add("AWM");
		list.add("KARM");
		list.add("BAZOOKA");
		list.add("M4 16");
		list.add("PAN");
		list.add("CHAPAL");
		list.add("PISTOL");
		list.stream().filter(i -> i.endsWith("M")).map(c -> c.toLowerCase()).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

//		for (String str : list) {
//			System.out.println(str);
//		}

	}

}
