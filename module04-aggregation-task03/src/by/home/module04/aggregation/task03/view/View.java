package by.home.module04.aggregation.task03.view;

import by.home.module04.aggregation.task03.entity.State;

public class View {

	public void printCapital(State state) {

		System.out.println(state.getName() + ". Столица:  " + state.getCapital().getName());
	}

	public void printNumOfRigions(State state) {

		System.out.println(state.getName() + ". Количество областей " + state.getRigions().size());
	}

	public void printAdministrativeCenterOfRigion(State state) {

		System.out.println(state.getName() + ". Областные центры: ");
		for (int i = 0; i < state.getRigions().size(); i++) {

			System.out.println(state.getRigions().get(i).getAdministrativeCenter().getName());

		}

	}

	public void printArea(State state) {

		System.out.println(state.getName() + ". Площадь: " + state.getArea());
	}
}