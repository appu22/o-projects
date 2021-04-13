package com.xworz.xworkzapp.hospital;

public class HospitalDto {
	private String name;
	private int noOfWards;
	private int noOfDoctors;
	private String type;
	private String specialist;
	private String location;

	public HospitalDto(String name, int noOfWards, int noOfDoctors, String type, String specialist, String location) {
		super();
		this.name = name;
		this.noOfWards = noOfWards;
		this.noOfDoctors = noOfDoctors;
		this.type = type;
		this.specialist = specialist;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfWards() {
		return noOfWards;
	}

	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}

	public int getNoOfNumber() {
		return noOfDoctors;
	}

	public void setNoOfNumber(int noOfNumber) {
		this.noOfDoctors = noOfNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof HospitalDto) {
			HospitalDto dto = (HospitalDto) obj;
			if (dto.name.equals(this.getName()) && dto.noOfDoctors == this.getNoOfDoctors()
					&& dto.noOfWards == this.getNoOfWards()) {

				System.out.println("");
			}
		}

		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
