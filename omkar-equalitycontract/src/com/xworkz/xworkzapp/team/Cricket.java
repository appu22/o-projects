package com.xworkz.xworkzapp.team;

public class Cricket {
	private String teamName;
	private String country;
	private String captainName;
	
	
	public Cricket(String teamName, String country, String captainName) {
		super();
		this.teamName = teamName;
		this.country = country;
		this.captainName = captainName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	
	
	

}
