package com.xworkz.xworkzapp.optional;

import java.util.Optional;

import com.xworkz.xworkzapp.optional.dto.BMTCDto;

public class OptionalTester {

	public static void main(String[] args) {

		BMTCDto bmtcDto = new BMTCDto();

		String a1= "appu";
		String a2 = null;
		
		Integer n = 10;
		Integer n1 = null;
		
		System.out.println(n1);
		//get() , empty() ,ofNullable,of(value)  , isPresent() , ofValue() , 
		Optional<Integer> a = Optional.ofNullable(n1);
		{
			if (a.isPresent()) {
				Integer k = a.get();
				System.out.println(" a value : " + k);
			}
			
		}
		
	}

}
