package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import visitor.RegimeVisitor;

public class Crevette extends Ingredient {

    public Crevette(String nom, Kebab kebab) {
        super(nom,kebab);
  
    }
    
    @Override
    public boolean isVegetarien() {
        return false;
    }

    @Override
    public boolean isPescetarien() {
        return super.isPescetarien();
        /* utilisation de super pour respecter la spec du pattern
		ce qui équivaut en fait à faire appel au kebab interne
		c-a-d que l'on pourrait écrire de manière plus lisible : return this.kebab.isVegetarien();
        Remarquez que, dans le contexte de ce projet, cette méthode n'ajoute pas de nouveau comportement : 
        elle ne fait rien d'autre que d'appeler la méthode de la superclasse.
        Donc, dans le contexte de ce projet, si on voulait optimiser l'écriture du programme, 
        ce ne serait même pas la peine d'écrire (de redéfinir) dans cette classe isPescetarien
        car son comportement n'apporte rien de nouveau ... ;-) */
    }
    
    @Override
	boolean accept(RegimeVisitor visitor) {
		return visitor.visit(this);
	}

    
 
}
