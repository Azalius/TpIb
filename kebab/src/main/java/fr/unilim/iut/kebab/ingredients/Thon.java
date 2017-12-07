package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import visitor.RegimeVisitor;

public class Thon extends Ingredient {

	public Thon(String nom, Kebab kebab) {
		super(nom, kebab);

	}

	@Override
	public boolean isVegetarien() {
		return false;
	}

	
	@Override
	public
	boolean accept(RegimeVisitor visitor) {
		return visitor.visit(this);
	}


}
