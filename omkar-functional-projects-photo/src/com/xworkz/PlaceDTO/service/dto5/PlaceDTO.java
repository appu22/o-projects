package com.xworkz.PlaceDTO.service.dto5;

import com.xworkz.PlaceDTO.enumm.*;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PlaceDTO {
	@NonNull
	private String name;
	@NonNull
	private Location location;
	@NonNull
	private long pincode;
	@NonNull
	private boolean goodPlace;

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", location=" + location + ", pincode=" + pincode + ", goodPlace=" + goodPlace
				+ "]";
	}

}
