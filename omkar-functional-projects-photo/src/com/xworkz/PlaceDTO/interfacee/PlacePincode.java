package com.xworkz.PlaceDTO.interfacee;

import com.xworkz.PlaceDTO.service.dto5.PlaceDTO;

public class PlacePincode implements SearchPlace {

	@Override
	public boolean searchPlace(PlaceDTO dto) {
		// NameAndLocationPincodePlaceSearch
//		if(dto.getPincode() != 0 && dto.getName().length() >5  && dto.getLocation().length()>5)
		return false;
	}

}
