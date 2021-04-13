package com.xworkz.photo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.photo.dto.PhotoDTO;
import com.xworkz.photo.dto.PhotoQualityEnum;
import com.xworkz.photo.dto.PhotoType;
import com.xworkz.photo.interfacee.SearchFilter;

public class PhotoServiceImpl implements PhotoService {

	List<PhotoDTO> list = new ArrayList<PhotoDTO>();

	public PhotoServiceImpl() {

		PhotoDTO dto = new PhotoDTO(PhotoType.JPG, 50, "16-03-2021", PhotoQualityEnum.HD, "AppuIMG");
		PhotoDTO dto1 = new PhotoDTO(PhotoType.JPG, 40, "10-03-2021", PhotoQualityEnum.FOURK, "TeerthIMG");
		PhotoDTO dto2 = new PhotoDTO(PhotoType.JPG, 60, "15-03-2021", PhotoQualityEnum.HD, "AliIMG");
		PhotoDTO dto3 = new PhotoDTO(PhotoType.JPEG, 82, "17-03-2021", PhotoQualityEnum.EIGHTK, "DarshsnIMG");
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

	}

	@Override
	public void serach(String name) {
		Iterator<PhotoDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			PhotoDTO dto = (PhotoDTO) iterator.next();
			if (dto.getFileName().equals(name)) {
				System.out.println("FileName is matching...******");
			} else {
				System.out.println("File Name Not Matching...");
			}
		}
	}

	@Override
	public void serachBySize(float size) {
		Iterator<PhotoDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			PhotoDTO dto = (PhotoDTO) iterator.next();
			if (dto.getSize() == size) {
				System.out.println("Size is matching...***");
			} else {
				System.out.println("Size  Not Matchin...");
			}

		}

	}

	@Override
	public void genericSearch(SearchFilter filter) {
		Iterator<PhotoDTO> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			PhotoDTO dto = iterator.next();
			if (filter.condition(dto)) {
				System.out.println("Size is matching.--->"+dto);
			} else {
				System.out.println("Size  Not Matchin...");
			}
		}

	}

	@Override
	public void searchQuality(SearchFilter quality) {
		Iterator<PhotoDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			PhotoDTO dto = iterator.next();
			if (quality.condition(dto)) {
				System.out.println("Size is matching.."+dto);
			} else {
				System.out.println("Size  Not Matchin...");
			}
		}

	}
}
