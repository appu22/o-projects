package com.xworkz.app.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeaponsTester2 {
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
		list.add("GPISTOL");

		List<String> temp1 = list.stream().filter((w) -> w.startsWith("G")).collect(Collectors.toList());
		List<String> temp2 = temp1.stream().map(e -> e.toLowerCase()).collect(Collectors.toList());
		temp2.forEach(e -> System.out.println(e));

	}

}
