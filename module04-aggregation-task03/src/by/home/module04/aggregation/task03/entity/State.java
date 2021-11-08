package by.home.module04.aggregation.task03.entity;

import java.util.ArrayList;
import java.util.List;


public class State {
	private String name;
	private City capital;
	private double area;
	private double population;
	private List<Rigion> rigions;

	public State() {
		name = "";
		capital = new City();
		area = 1;
		population = 1;
		rigions = new ArrayList<>();

	}

	public State(String name, City capital, double area, double population, List<Rigion> rigions) {

		this.name = name;
		this.capital = capital;
		this.area = area;
		this.population = population;
		this.rigions = rigions;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
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

	public List<Rigion> getRigions() {
		return rigions;
	}

	public void setRigions(List<Rigion> rigions) {
		this.rigions = rigions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(population);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rigions == null) ? 0 : rigions.hashCode());
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
		State other = (State) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(population) != Double.doubleToLongBits(other.population))
			return false;
		if (rigions == null) {
			if (other.rigions != null)
				return false;
		} else if (!rigions.equals(other.rigions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + ", capital=" + capital + ", area=" + area
				+ ", population=" + population + ", rigions=" + rigions + "]";
	}

}
