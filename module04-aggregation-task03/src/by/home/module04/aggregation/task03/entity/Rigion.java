package by.home.module04.aggregation.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class Rigion {

	private String name;
	private double area;
	private double population;
	private City administrativeCenter;
	private List<District> districts;

	public Rigion() {

		name = "";
		area = 1;
		population = 1;
		administrativeCenter = new City();
		districts = new ArrayList<>();
	}

	public Rigion(String name, double area, double population, City administrativeCenter, List<District> districts) {

		this.name = name;
		this.area = area;
		this.population = population;
		this.administrativeCenter = administrativeCenter;
		this.districts = districts;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public City getAdministrativeCenter() {
		return administrativeCenter;
	}

	public void setAdministrativeCenter(City administrativeCenter) {
		this.administrativeCenter = administrativeCenter;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((administrativeCenter == null) ? 0 : administrativeCenter.hashCode());
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
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
		Rigion other = (Rigion) obj;
		if (administrativeCenter == null) {
			if (other.administrativeCenter != null)
				return false;
		} else if (!administrativeCenter.equals(other.administrativeCenter))
			return false;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
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
		return getClass().getSimpleName() + " [name=" + name + ", area=" + area + ", population=" + population
				+ ", administrativeCenter=" + administrativeCenter + ", districts=" + districts + "]";
	}

}