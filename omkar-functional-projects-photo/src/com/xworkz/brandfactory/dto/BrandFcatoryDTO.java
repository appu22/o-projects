package com.xworkz.brandfactory.dto;

import com.xworkz.brandfactory.enumm.Location;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class BrandFcatoryDTO {

	@NonNull
	private int noOfBrand;
	@NonNull
	private Location location;
	@NonNull
	private int noOfCounters;
	@NonNull
	private boolean isOpen;

}
