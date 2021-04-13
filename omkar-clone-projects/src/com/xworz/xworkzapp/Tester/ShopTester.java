package com.xworz.xworkzapp.Tester;

import com.xworz.xworkzapp.shop.ShopDto;

public class ShopTester {

	public static void main(String[] args) throws CloneNotSupportedException {

		ShopDto dto = new ShopDto("GeneralStore", "Shri Guru Krupa", "Belagavi", "Appu");
		ShopDto dto1 = new ShopDto("GeneralStore", "Shri Guru Krupa", "Belagavi", "Appu");

		Object object = dto.clone();
		ShopDto dto2 = (ShopDto) object;
		
		if (dto.equals(dto1))  {   //&& dto.hashCode()==dto2.hashCode())
			System.out.println("data matched");
		} else {
			System.out.println("Data is not mathced");
		}

		
		System.out.println("Middle Name 	: " + dto2.getShopType());
		System.out.println("First Name 	: " + dto2.getShopName());
		System.out.println("Middle Name 	: " + dto2.getShopLocation());

	}

}
