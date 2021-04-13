package com.xworkz.brandfactory;

import com.xworkz.brandfactory.dto.BrandFcatoryDTO;
import com.xworkz.brandfactory.enumm.Location;
import com.xworkz.brandfactory.functional.SearchBrandFactory;
import com.xworkz.brandfactory.servvice.BrandFactoryService;
import com.xworkz.brandfactory.servvice.BrandFactoryServiceImple;

public class BrandFactoryTester {

	public static void main(String[] args) {

		System.out.println("Program Start");
		
		BrandFactoryServiceImple imple = new BrandFactoryServiceImple();
		
		imple.search((d)->{
			return d.getLocation().equals(Location.BANIRIGHATTA);
		});

		//SearchBrandFactory brandFactory = new SearchBrandFactory() {

			//()->((brandFactory){});
			
//			@Override
//			public boolean searchByDTO(BrandFcatoryDTO dto) {
//				if (dto.getNoOfBrand() > 15)
//					return true;
//				return false;
//			}
//		};
//
//		BrandFactoryService imple = new BrandFactoryServiceImple();
//
//		imple.search(brandFactory);

		System.out.println("Program end");

	}
}
