package unilim.fr.kebab;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Ingredient implements Kebab {
	private String nom;
	private ArrayList<Kebab> ingredients;
	public Ingredient(String nom) {
		this.nom = nom;
		this.ingredients = new ArrayList();
	}
	@Override
	public void addIngredient(Ingredient ingredient) {
		this.ingredients.add(ingredient);
	}
	@Override
	public boolean isVegetarien() {
		for (Iterator<Kebab> i = this.ingredients.iterator(); i.hasNext();) {
		    Kebab keb = i.next();
		    if (!keb.isVegetarien()) {
		    	return false;
		    }
		}
		return true;
	}
	@Override
	public boolean isPescetarien() {
		for (Iterator<Kebab> i = this.ingredients.iterator(); i.hasNext();) {
		    Kebab keb = i.next();
		    if (!keb.isPescetarien()) {
		    	return false;
		    }
		}
		return true;
	}
}
