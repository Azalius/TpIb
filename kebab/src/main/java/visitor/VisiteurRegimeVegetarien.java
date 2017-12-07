package visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public class VisiteurRegimeVegetarien implements RegimeVisitor {

	@Override
	public boolean visit(Agneau ingredient) {
		return false;
	}

	@Override
	public boolean visit(Thon ingredient) {
		return false;
	}

	@Override
	public boolean visit(Crevette ingredient) {
		return false;
	}

	@Override
	public boolean visit(Fromage ingredient) {
		return true;
	}

	@Override
	public boolean visit(Oignon ingredient) {
		return true;
	}

	@Override
	public boolean visit(Salade ingredient) {
		return true;
	}

	@Override
	public boolean visit(Tomate ingredient) {
		return true;
	}

	@Override
	public boolean visit(Sauce ingredient) {
		return true;
	}

	@Override
	public boolean visit(Pain ingredient) {
		return true;
	}

	@Override
	public boolean visit(Assiette ingredient) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visit(Boeuf ingredient) {
		// TODO Auto-generated method stub
		return false;
	}

}
