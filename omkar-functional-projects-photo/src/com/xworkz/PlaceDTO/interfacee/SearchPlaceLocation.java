package com.xworkz.PlaceDTO.interfacee;

import com.xworkz.PlaceDTO.service.dto5.PlaceDTO;

public class SearchPlaceLocation implements SearchPlace {

	@Override
	public boolean searchPlace(PlaceDTO dto) {

		if (dto.getLocation().equals(dto))

			return true;

		return false;

	}

}
