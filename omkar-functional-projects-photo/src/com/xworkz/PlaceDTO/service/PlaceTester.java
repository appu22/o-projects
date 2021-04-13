package com.xworkz.PlaceDTO.service;

import com.xworkz.PlaceDTO.interfacee.PlacePincode;
import com.xworkz.PlaceDTO.interfacee.SearchByLocation;
import com.xworkz.PlaceDTO.interfacee.SearchPlace;
import com.xworkz.PlaceDTO.service.dto5.PlaceDTO;

public class PlaceTester {

	public static void main(String[] args) {

		PlaceServiceImple imple = new PlaceServiceImple();

		SearchPlace place = new SearchByLocation();

		imple.searchByLocation(place);

	}

}
