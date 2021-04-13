package com.xworkz.photo.interfacee;

import com.xworkz.photo.dto.PhotoDTO;
import com.xworkz.photo.dto.PhotoQualityEnum;

public class PhotoQuality implements SearchFilter {

	@Override
	public boolean condition(PhotoDTO dto) {
		if (dto.getQuality().equals(PhotoQualityEnum.HD))
			return true;
		return false;
	}

}
