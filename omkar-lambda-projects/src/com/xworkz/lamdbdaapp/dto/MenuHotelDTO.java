package com.xworkz.lamdbdaapp.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class MenuHotelDTO {
	@NonNull
	private String name;
	@NonNull
	private double price;
	@NonNull
	private int counterNumber;

}
