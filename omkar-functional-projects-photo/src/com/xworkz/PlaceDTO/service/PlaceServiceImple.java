package com.xworkz.PlaceDTO.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.PlaceDTO.enumm.Location;
import com.xworkz.PlaceDTO.interfacee.SearchPlace;
import com.xworkz.PlaceDTO.service.dto5.PlaceDTO;

public class PlaceServiceImple implements PlaceService {

	List<PlaceDTO> list = new ArrayList<PlaceDTO>();

	public PlaceServiceImple() {

		PlaceDTO dto = new PlaceDTO("Dttaterya Temple", Location.KANAKNAGAR, 591325, true);
		PlaceDTO dto1 = new PlaceDTO("Yallaingehswar Temple", Location.BANASHANKARI, 591235, true);
		PlaceDTO dto2 = new PlaceDTO("malleshwaram circle", Location.MALLESHWARAM, 0, false);
		PlaceDTO dto3 = new PlaceDTO("fghjj", Location.RAMMURTHYNAGAR, 591235, true);
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
	}

	@Override
	public void searchByLocation(SearchPlace location) {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			PlaceDTO dto = (PlaceDTO) iterator.next();
			if (location.searchPlace(dto))
				System.out.println("Datat Found : " + dto);

		}
	}
}
