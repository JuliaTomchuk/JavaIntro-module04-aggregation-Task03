package by.home.module04.aggregation.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String name;
	private List<City> cities;
	private City administrativeCenter;
	private double area;
	private double population;

	public District() {
		name = "";
		cities = new ArrayList<>();
		administrativeCenter = new City();
		area = 1;
		population = 1;

	}

	public District(String name, List<City> cities, City administrativeCenter, double area, double population) {
		this.name = name;
		this.cities = cities;
		this.administrativeCenter = administrativeCenter;
		this.area = area;
		this.population = population;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public City getAdministrativeCenter() {
		return administrativeCenter;
	}

	public void setAdministrativeCenter(City administrativeCenter) {
		this.administrativeCenter = administrativeCenter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((administrativeCenter == null) ? 0 : administrativeCenter.hashCode());
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(population);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		if (administrativeCenter == null) {
			if (other.administrativeCenter != null)
				return false;
		} else if (!administrativeCenter.equals(other.administrativeCenter))
			return false;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(population) != Double.doubleToLongBits(other.population))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + ", cities=" + cities + ", administrativeCenter="
				+ administrativeCenter + ", area=" + area + ", population=" + population + "]";
	}

}
