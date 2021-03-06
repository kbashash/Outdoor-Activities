package outDoorActivities;

import java.util.ArrayList;

public class Country extends PopulatedArea {
	private ArrayList<Province> provinces=new ArrayList<>();
	private String countryCode;
	private City capitalOfCountry= new City();
	
	public Country(){
		super();
	}
	
	public Country(String name, Double longitude, Double latitude,int population,
			 String countryCode, ArrayList<Province> provinces, City capitalOfCountry ) {
		super(name, longitude, latitude, population);
		this.countryCode=countryCode;
		this.provinces=provinces;
		this.capitalOfCountry=capitalOfCountry;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public ArrayList<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(ArrayList<Province> provinces) {
		this.provinces = provinces;
	}

	public City getCapitalOfCountry() {
		return capitalOfCountry;
	}

	public void setCapitalOfCountry(City capitalOfCountry) {
		this.capitalOfCountry = capitalOfCountry;
	}
	
	public boolean equals(String name) {
		if (this.getName().equals(name)) return true;
		else return false;
	}
	public boolean equals(Country country) {
		if (this.getName().equals(country.getName())) return true;
		else return false;
	}
	public void addProvince(Province province) {
		this.provinces.add(province);
		super.setPopulation(super.getPopulation()+province.getPopulation());
	}
	
	
	
	
	
}
