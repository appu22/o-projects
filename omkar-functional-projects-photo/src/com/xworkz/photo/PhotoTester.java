package com.xworkz.photo;

import com.xworkz.photo.interfacee.PhotoSearchImple;
import com.xworkz.photo.service.PhotoService;
import com.xworkz.photo.service.PhotoServiceImpl;

public class PhotoTester {

	public static void main(String[] args) {
//heap memory size 
//		Runtime.getRuntime().maxMemory();
//		System.out.println("");

		PhotoService photo = new PhotoServiceImpl();
//		photo.serach("AppuIMG");
		PhotoSearchImple imple = new PhotoSearchImple();
//		photo.searchQuality(imple);
		photo.genericSearch(imple);

//		PhotoQualityImpl
//		photo.serachBySize(20);

	}

}
