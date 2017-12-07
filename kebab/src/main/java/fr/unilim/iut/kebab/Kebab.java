package fr.unilim.iut.kebab;

import java.util.Iterator;
import java.util.List;
import fr.unilim.iut.kebab.ingredients.Ingredient;
import visitor.RegimeVisitor;
import visitor.VisiteurRegimePescetarien;

public abstract class Kebab {
	public abstract List<Ingredient> getIngredients();
	public abstract boolean isVegetarien();
	public boolean isPescetarien() {
		VisiteurRegimePescetarien visitor = new  VisiteurRegimePescetarien();
		for (Iterator<Ingredient> i = this.getIngredients().iterator(); i.hasNext();) {
		    Ingredient ingredient = i.next();
		    if (!ingredient.accept(visitor)) {
		    	return false;
		    }
		}
		return true;
	}
	public abstract boolean accept(RegimeVisitor visitor);
}
