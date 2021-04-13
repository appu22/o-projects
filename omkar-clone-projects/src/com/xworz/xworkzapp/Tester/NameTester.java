package com.xworz.xworkzapp.Tester;

import com.xworz.xworkzapp.nameDetails.NameDto;

public class NameTester {

	public static void main(String[] args) throws CloneNotSupportedException {

		NameDto dto = new NameDto("Appu", "Shrikanth", "Badiger", "Belgavi", 82134567545l, 591335);
		NameDto dto1 = new NameDto("Appu", "Shrikanth", "Badiger", "Belgavi", 82134567545l, 591335);

		if (dto.equals(dto1)) {
			System.out.println(" Equal ");
		} else {
			System.out.println("Not equal");
		}
		
		Object object = dto.clone();
		NameDto dto2 = (NameDto)object;
		System.out.println("First Name 	: "+dto2.getFirstName());
		System.out.println("Middle Name 	: "+dto2.getMiddleName());
		System.out.println("Last Name 	: "+dto2.getLastName());
		System.out.println("Phone Number    : "+dto2.getPhoneNo());
		System.out.println("Pin Code        : "+dto2.getZipCode());
//		System.out.println(""+dto2.getClass());
	}
	
	

}
