package com.xworkz.brandfactory.servvice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.brandfactory.enumm.*;
import com.xworkz.brandfactory.dto.BrandFcatoryDTO;
import com.xworkz.brandfactory.functional.SearchBrandFactory;

public class BrandFactoryServiceImple implements BrandFactoryService {

	List<BrandFcatoryDTO> list = new ArrayList<BrandFcatoryDTO>();

	public BrandFactoryServiceImple() {

		BrandFcatoryDTO dto = new BrandFcatoryDTO(12, Location.BANIRIGHATTA, 4, false);

		BrandFcatoryDTO dto1 = new BrandFcatoryDTO(15, Location.JALHALLICROSS, 5, true);
		BrandFcatoryDTO dto3 = new BrandFcatoryDTO(45, Location.MALLESHWARAM, 9, false);
		BrandFcatoryDTO dto4 = new BrandFcatoryDTO(35, Location.VIJAYNAGAR, 12, true);
		list.add(dto);
		list.add(dto1);
		list.add(dto3);
		list.add(dto4);

	}

	@Override
	public void search(SearchBrandFactory search) {
		Iterator<BrandFcatoryDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			BrandFcatoryDTO next = iterator.next();
			if (search.searchByDTO(next)) {
				System.out.println("Data found " + next);
//			} else {
//				System.out.println("Data not found ");
			}

		}

	}

//	@Override
//	public void searchByCounters(SearchBrandFactory counter) {
//		Iterator<BrandFcatoryDTO> iter = list.iterator();
//		while(iter.hasNext()) {
//			BrandFcatoryDTO dto = iter.next();
//			if(counter.searchByDTO(dto)) {
//				System.out.println("Counters  Data Found "+ dto);
//			}else {
//				System.out.println("Counters Not Found ");
//			}
//		}

}
