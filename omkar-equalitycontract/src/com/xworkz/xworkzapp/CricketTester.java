package com.xworkz.xworkzapp;

import com.xworkz.xworkzapp.team.Cricket;

public class CricketTester {
	public static void main(String[] args) {
		
		Cricket cricket = new Cricket("rcb", "ind", "virat");
		Cricket cricket1 = new Cricket("csk", "ind", "msd");
		
		System.out.println(cricket.equals(cricket1));
		
		String str = "appu";
		String str1 = "appu";
		
		System.out.println(str.equals(str1));
		
		
		
	}

}
