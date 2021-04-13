package com.xworkz.lamdbdaapp.Tester;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.lamdbdaapp.dto.DominesDTO;

public class DominesTester {

	public static void main(String[] args) {

		DominesDTO dominesDTO = new DominesDTO("Onion-Pizza", 450, "Vijanahgar");
		DominesDTO dominesDTO1 = new DominesDTO("Margherita", 550, "RajajiNagar");
		DominesDTO dominesDTO2 = new DominesDTO("Deluxe", 650, "Malleshwaram");
		DominesDTO dominesDTO3 = new DominesDTO("Farm House", 750, "RajajiNagar");
		
		List<DominesDTO>  list = new ArrayList<DominesDTO>();
		list.add(dominesDTO);
		list.add(dominesDTO1);
		list.add(dominesDTO2);
		list.add(dominesDTO3);
		System.out.println("450 above pizza  Prices list : ");
		list.stream().filter((z)->z.getPizzaPrice() > dominesDTO.getPizzaPrice())
		.map(s->s.getPizzaName()).forEach(c->System.out.println("Price : "+c+" "));

	}

}
