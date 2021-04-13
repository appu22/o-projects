package com.xworkz.lamdbdaapp.Tester;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.lamdbdaapp.dto.RegisterDTO;

public class RegisterTester {

	public static void main(String[] args) {
		System.out.println("Program Start");
		
		RegisterDTO appu = new RegisterDTO("Appu", 1234567l, 821345678945l);
		RegisterDTO ali = new RegisterDTO("ali", 1234567l, 821345678945l);
		RegisterDTO kiran = new RegisterDTO("kiran", 1234567l, 821345678945l);
		RegisterDTO santhosh = new RegisterDTO("santhosh", 1234567l, 821345678945l);
		RegisterDTO surya = new RegisterDTO("surya", 1234567l, 821345678945l);
		RegisterDTO raj = new RegisterDTO("raj", 1234567l, 821345678945l);

		List<RegisterDTO> dtos = new ArrayList<RegisterDTO>();
		dtos.add(appu);
		dtos.add(ali);
		dtos.add(kiran);
		dtos.add(raj);
		dtos.add(surya);
		dtos.add(santhosh);

		List<RegisterDTO> collect = dtos.stream().filter((e) -> e.getAdharCard() == santhosh.getAdharCard())
				.collect(Collectors.toList());

		collect.forEach(g -> System.out.println(g));

//		for (RegisterDTO registerDTO : collect) {
//			System.out.println(registerDTO);
//		}

		System.out.println("Program end");

	}

}
