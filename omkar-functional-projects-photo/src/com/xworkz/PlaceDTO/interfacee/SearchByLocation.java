package com.xworkz.PlaceDTO.interfacee;

import com.xworkz.PlaceDTO.enumm.Location;
import com.xworkz.PlaceDTO.service.dto5.PlaceDTO;

public class SearchByLocation implements SearchPlace {

	@Override
	public boolean searchPlace(PlaceDTO dto) {
		if(dto.getLocation().equals((Location.BANASHANKARI)))
			return true;
		return false;
	}

}
