package com.xworkz.photo.service;

import com.xworkz.photo.interfacee.SearchFilter;

public interface PhotoService {
	
	
	public void serach(String name);

	public void serachBySize(float size);
	
	public void genericSearch(SearchFilter filter);
	
	public void searchQuality(SearchFilter quality);
	
	
	
}
