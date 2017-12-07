package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import visitor.RegimeVisitor;

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
	@Override
	boolean accept(RegimeVisitor visitor) {
		return visitor.visit(this);
	}

}
