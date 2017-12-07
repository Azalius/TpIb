package visitor;

import fr.unilim.iut.kebab.ingredients.Agneau;

public class VisiteurRegimePescetarien implements RegimeVisitor {

	@Override
	public boolean visit(Agneau ingredient) {
		return false;
	}
	
}
