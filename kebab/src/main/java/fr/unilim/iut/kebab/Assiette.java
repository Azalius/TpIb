package fr.unilim.iut.kebab;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.kebab.ingredients.Ingredient;
import visitor.RegimeVisitor;

public class Assiette extends Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}

	public boolean isVegetarien() {
		return true;
	}

	public boolean isPescetarien() {
		return true;
	}

	@Override
	public boolean accept(RegimeVisitor visitor) {
		return true;
	}


}
