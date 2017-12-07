package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import visitor.RegimeVisitor;

public class Pain extends Ingredient {

	public Pain(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isVegetarien() {
		return super.isVegetarien();
	}


	@Override
	public
	boolean accept(RegimeVisitor visitor) {
		return visitor.visit(this);
	}


}
