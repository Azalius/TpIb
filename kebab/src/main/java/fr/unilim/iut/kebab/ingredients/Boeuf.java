package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;

public class Boeuf extends Ingredient {

	public Boeuf(String nom, Kebab kebab) {
		super(nom, kebab);

	}

	@Override
	public boolean isVegetarien() {
		return false;
	}

	@Override
	public boolean isPescetarien() {
		return false;
	}
}
