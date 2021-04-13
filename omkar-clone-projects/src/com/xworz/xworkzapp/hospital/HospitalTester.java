package com.xworz.xworkzapp.hospital;

public class HospitalTester {
	
	public static void main(String[] args) {
		
	HospitalDto dto = new HospitalDto("Esi hospital", 4, 5,
			"Goverment", "Multi specislist", "Benglore");
	HospitalDto dto1 = new HospitalDto("Sakar hospital", 4, 5,
			"private Hospital", "Multi specislist", "Benglore");

	if(dto.equals(dto1)) {
		System.out.println("equal");
		
	}else {
		System.out.println("Not equal");
	}
	}
}