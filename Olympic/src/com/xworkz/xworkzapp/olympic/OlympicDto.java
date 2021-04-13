package com.xworkz.xworkzapp.olympic;

public class OlympicDto {

	String name;
	String countryHosted;
	int year;
	boolean completed;

	public OlympicDto(String name, String countryHosted, int year, boolean completed) {
		super();
		this.name = name;
		this.countryHosted = countryHosted;
		this.year = year;
		this.completed = completed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryHosted() {
		return countryHosted;
	}

	public void setCountryHosted(String countryHosted) {
		this.countryHosted = countryHosted;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public int hashCode() {
		return this.getYear();
	}

	@Override
	public boolean equals(Object obj2) {
		if (obj2 == null)
			return false;
		if (obj2 instanceof OlympicDto)
		{
			OlympicDto dto = (OlympicDto) obj2;
			if (dto.year == this.year)
				System.out.println("checking year");
			return true;
		} else
		{
			System.out.println("Not Equal");
		}
		return false;

	}

}
