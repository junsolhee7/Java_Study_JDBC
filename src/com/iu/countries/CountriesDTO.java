package com.iu.countries;

public class CountriesDTO {

	private String Country_ID;
	private String Country_name;
	private Integer Region_ID;
	
	public String getCountry_ID() {
		return Country_ID;
	}
	public void setCountry_ID(String country_ID) {
		Country_ID = country_ID;
	}
	public String getCountry_name() {
		return Country_name;
	}
	public void setCountry_name(String country_name) {
		Country_name = country_name;
	}
	public Integer getRegion_ID() {
		return Region_ID;
	}
	public void setRegion_ID(Integer region_ID) {
		Region_ID = region_ID;
	}
}
