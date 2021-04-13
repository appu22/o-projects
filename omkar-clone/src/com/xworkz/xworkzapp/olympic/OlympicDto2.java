package com.xworkz.xworkzapp.olympic;

public class OlympicDto2 implements Cloneable {

	String name;
	String year;

	public OlympicDto2(String name, String year) {
		super();
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoking clone from ");
		return super.clone();
	}

	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof OlympicDto2) {
			OlympicDto2 dto = (OlympicDto2) obj;
			if (dto.name
					.equals(this.getName()) || dto.year.equals(this.year)) {
				System.out.println("name and year is equal");
				return true;
			} else {
				System.out.println("no equal");
				return false;
			}
		}
		return false;
	}

}
