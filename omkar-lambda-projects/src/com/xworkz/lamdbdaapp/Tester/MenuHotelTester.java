package com.xworkz.lamdbdaapp.Tester;

import java.util.LinkedList;

import java.util.List;

import com.xworkz.lamdbdaapp.dto.MenuHotelDTO;

public class MenuHotelTester {

	public static void main(String[] args) {

		System.out.println("-------Udapi Hotel----\n--------BreakFast------------");

		MenuHotelDTO idli = new MenuHotelDTO("Idli", 34.5, 01);
		MenuHotelDTO dose = new MenuHotelDTO("Dose", 50.5, 02);
		MenuHotelDTO setdosa = new MenuHotelDTO("SetDosa", 30.5, 03);
		MenuHotelDTO kesari = new MenuHotelDTO("Kesari", 25.5, 00);
		MenuHotelDTO puligoare = new MenuHotelDTO("Puligoare", 45.0, 05);
		MenuHotelDTO masalrice = new MenuHotelDTO("MasalaRice", 30.7, 06);
		MenuHotelDTO uppit = new MenuHotelDTO("Uppit", 25.0, 07);

		List<MenuHotelDTO> dtos = new LinkedList<MenuHotelDTO>();

		dtos.add(idli);
		dtos.add(uppit);
		dtos.add(masalrice);
		dtos.add(puligoare);
		
		List<MenuHotelDTO> dtos1 = new LinkedList<MenuHotelDTO>();
		dtos1.add(kesari);
		dtos1.add(setdosa);
		dtos1.add(dose);

		dtos.stream().filter((f) -> f.getCounterNumber() == idli.getCounterNumber())
		.map(s -> s.getName().length())
		.forEach(x -> System.out.println(x));
		
		dtos.stream().filter((o) -> o.getName().endsWith("e")).forEach(i->System.out.println(i));


	}

}
