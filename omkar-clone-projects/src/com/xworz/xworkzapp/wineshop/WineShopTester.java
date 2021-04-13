package com.xworz.xworkzapp.wineshop;

public class WineShopTester {

	public static void main(String[] args) throws CloneNotSupportedException {

		WineShopDto dto = new WineShopDto("darshanbar", 4, 1234, "GST1234");

		WineShopDto dto1 = new WineShopDto("darshanbar", 5, 1234, "GST1234");

		if (dto.equals(dto1)) {
			System.out.println("winshop data same ");
		} else {
			System.out.println("winshop data is not same ");
		}

		Object dto2 = dto.clone();
		
		WineShopDto dto3 = (WineShopDto)dto2;
		System.out.println("********all data copied**********");
		System.out.println("GSt Number             : "+dto3.gstNo);
		System.out.println("Winshop Licence Number : "+dto3.licenceNo);
		System.out.println("No of Tables           : "+dto3.noOfTables);
	}

}
