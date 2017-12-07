package fr.unilim.iut.kebab;

import java.util.List;
import fr.unilim.iut.kebab.ingredients.Ingredient;

public interface Kebab {
	List<Ingredient> getIngredients();
	boolean isVegetarien();
	boolean isPescetarien();
}
