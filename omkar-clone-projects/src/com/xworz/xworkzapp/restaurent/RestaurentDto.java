package com.xworz.xworkzapp.restaurent;

public class RestaurentDto implements Cloneable {

	private String name;
	private String type;
	private int noOfTables;
	private String reservation;

	public RestaurentDto(String name, String type, int noOfTables, String reservation) {
		super();
		this.name = name;
		this.type = type;
		this.noOfTables = noOfTables;
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfTables() {
		return noOfTables;
	}

	public void setNoOfTables(int noOfTables) {
		this.noOfTables = noOfTables;
	}

	public String getReservation() {
		return reservation;
	}

	public void setReservation(String reservation) {
		this.reservation = reservation;
	}

	@Override
	public int hashCode() {
		return noOfTables;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof RestaurentDto) {
			RestaurentDto dto = (RestaurentDto) obj;
			if ( dto.name.equals(getName()) && dto.type.equals(getType())) {
				System.out.println("all data same ");
				return true;
			} else {
				System.out.println("data are not matched ");
			}

		}

		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
