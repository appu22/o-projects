package com.xworkz.photo.interfacee;

import com.xworkz.photo.dto.PhotoDTO;

public class PhotoSearchImple implements SearchFilter {

	@Override
	public boolean condition(PhotoDTO dto) {

		if (dto.getSize() > 50)
			return true;

		return false;
	}

}
