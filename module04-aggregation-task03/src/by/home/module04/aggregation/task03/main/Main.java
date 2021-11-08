package by.home.module04.aggregation.task03.main;

/* Создать объект класса государство, используя классы Область,Район, Город.
 * Методы: вывести на консоль столицу,количество областей, площадь, областные центры*/

import java.util.ArrayList;
import java.util.List;

import by.home.module04.aggregation.task03.entity.City;
import by.home.module04.aggregation.task03.entity.District;
import by.home.module04.aggregation.task03.entity.Rigion;
import by.home.module04.aggregation.task03.entity.State;
import by.home.module04.aggregation.task03.view.View;

public class Main {

	public static void main(String[] args) {

		City brestCity = new City("Брест", 146.1, 343.985);
		City minskCity = new City("Минск", 348.8, 2009786);
		City grodnoCity = new City("Гродно", 142.1, 368.710);
		City gomelCity = new City("Гомель", 139.8, 510300);
		City mogilevCity = new City("Могилёв ", 118.5, 357100);
		City vitebskCity = new City("Витебск", 124.5, 362.466);

		List<City> cities = new ArrayList<>();

		cities.add(brestCity);
		cities.add(minskCity);
		cities.add(grodnoCity);
		cities.add(gomelCity);
		cities.add(mogilevCity);
		cities.add(vitebskCity);

		List<District> districts = new ArrayList<>();

		Rigion mogilevRigion = new Rigion("Могилёвская область", 29068, 1148000, mogilevCity, districts);
		Rigion grodnoRigion = new Rigion("Гродненская область", 25127, 1039000, grodnoCity, districts);
		Rigion vitebskRigion = new Rigion("Витебская область", 40051, 1136000, vitebskCity, districts);
		Rigion gomelRigion = new Rigion(" Гомельская область", 40372, 1375000, gomelCity, districts);
		Rigion brestRigion = new Rigion("Брестская область", 32786, 1338000, brestCity, districts);
		Rigion minskRigion = new Rigion("Минская область", 39854, 1473000, minskCity, districts);

		List<Rigion> rigions = new ArrayList<>();

		rigions.add(mogilevRigion);
		rigions.add(grodnoRigion);
		rigions.add(vitebskRigion);
		rigions.add(gomelRigion);
		rigions.add(brestRigion);
		rigions.add(minskRigion);

		State belarus = new State("Беларусь", minskCity, 255.8, 1992000, rigions);

		View view = new View();

		view.printCapital(belarus);
		view.printNumOfRigions(belarus);

		view.printAdministrativeCenterOfRigion(belarus);

		view.printArea(belarus);

	}

}
