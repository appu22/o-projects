package com.xworkz.lamdbdaapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class DominesDTO {
	@NonNull
	private String pizzaName;
	@NonNull
	private double pizzaPrice;
	@NonNull
	private String location;

}
