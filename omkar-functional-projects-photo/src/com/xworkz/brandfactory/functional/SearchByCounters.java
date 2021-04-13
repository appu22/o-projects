package com.xworkz.brandfactory.functional;

import com.xworkz.brandfactory.dto.BrandFcatoryDTO;

public class SearchByCounters implements SearchBrandFactory{

	@Override
	public boolean searchByDTO(BrandFcatoryDTO dto) {
		if(dto.getNoOfCounters()>5)
			return true;
		return false;
	}
	
	
	

}
