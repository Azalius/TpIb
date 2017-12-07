package visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.*;

public interface RegimeVisitor {
	boolean visit(Agneau ingredient);
	boolean visit(Thon ingredient);
	boolean visit(Crevette ingredient);
	boolean visit(Fromage ingredient);
	boolean visit(Oignon ingredient);
	boolean visit(Salade ingredient);
	boolean visit(Tomate ingredient);
	boolean visit(Sauce ingredient);
	boolean visit(Pain ingredient);
	boolean visit(Assiette ingredient);
	boolean visit(Boeuf ingredient);
}
