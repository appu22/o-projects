package com.xworkz.lamdbdaapp;

import java.util.LinkedList;
import java.util.List;

public class MonumentsTester {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Taj Mahal Agra");
		list.add("Gateway of India Mumbai");
		list.add("India Gate New Delhi");
		list.add("Hawa Mahal Jaipur");
		list.add("Golden Temple Amritsar");
		list.add("Charminar Hyderabad");
		list.add("Red Fort");
		list.add("Mysore Palace");
		list.add("Hampi  ");
		list.add("Sanchi Stupa");
		list.add("       Pattadaka");
		list.add("Nalanda");
		list.add("  B  a   a");
		
		
		list.stream().filter((x)->x.startsWith("H")).map(b->b.translateEscapes()).forEach(f->System.out.println(f));
		//trim()starting space  removed suport with endswith
		System.out.println("-------------------------------------");
		list.stream().filter((x)->x.endsWith("a")).map(b->b.trim()).forEach(f->System.out.println(f));
		
		
	}
	

}
