package com.xworz.xworkzapp.restaurent;

public class RestaurentTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("program start");

		RestaurentDto dto = new RestaurentDto("Ganesh Restaurent", "Family Restaurent", 5, "dinner");

		RestaurentDto dto1 = new RestaurentDto("Ganesh Restaurent", "Family Restaurent", 3, "dinner");

		Object object = (Object) dto.clone();
		RestaurentDto dto2 = (RestaurentDto) object;

		System.out.println(dto2.getName());
		System.out.println(dto2.getNoOfTables());
		System.out.println(dto2.getReservation());
		System.out.println(dto2.getType());

		if (dto.equals(dto1) && dto.hashCode() == dto1.hashCode()) {
			System.out.println("all data are equal ");
		} else {
			System.out.println("all data not equal");
		}
		System.out.println("program start");
	}

}
