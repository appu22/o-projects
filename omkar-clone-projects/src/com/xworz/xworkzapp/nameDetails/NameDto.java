package com.xworz.xworkzapp.nameDetails;

public class NameDto implements Cloneable {

	String firstName;
	String middleName;
	String lastName;
	String cityName;
	long phoneNo;
	int zipCode;

	public NameDto(String firstName, String middleName, String lastName, String cityName, long phoneNo, int zipCode) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cityName = cityName;
		this.phoneNo = phoneNo;
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("inside the equals method");
		if (obj == null)
			return false;
		if (obj instanceof NameDto) {
			NameDto dto = (NameDto) obj;
			if (dto.phoneNo == getPhoneNo())
			
			{
				System.out.println("Phone Number Is equal");
			} else {
				System.out.println("Phone number is not equal");
			}
		}
		return false;
	}

}
