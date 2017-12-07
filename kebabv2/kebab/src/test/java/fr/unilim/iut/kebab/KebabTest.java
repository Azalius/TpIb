package fr.unilim.iut.kebab;


import fr.unilim.iut.kebab.ingredients.*;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat; 
// Tests écrits avec AssertJ pour simplifier et faciliter l'écriture des tests sur des collections (d'ingrédients dans notre cas ;-) )
// Pour tout savoir sur AssertJ: http://joel-costigliola.github.io/assertj/
// Pour pouvoir utiliser AssertJ dans votre projet maven, ajoutez dans votre pom.xml
/*
		 <dependency>
                <groupId>org.assertj</groupId>
                <artifactId>assertj-core</artifactId>
                <version>3.2.0</version>
                <scope>test</scope>
            </dependency>
 */

public class KebabTest {

    private Kebab kebabCarnivore;
    private Kebab kebabVegetarien;
    private Kebab kebabPoisson;
    private Kebab kebabCrevette;
    
    @Before
    public void setUp() {

        kebabCarnivore = new Assiette();
        kebabCarnivore = new Pain("pita",kebabCarnivore);
        kebabCarnivore = new Oignon("oignon blanc",kebabCarnivore);
        kebabCarnivore = new Sauce("sauce algérienne",kebabCarnivore);
        kebabCarnivore = new Agneau("agneau de pré-salé",kebabCarnivore);
        kebabCarnivore = new Tomate("tomate rouge",kebabCarnivore);
       
            
        kebabVegetarien = new Sauce("sauce algérienne",
        					new Tomate("tomate rouge",
        						new Oignon("oignon blanc",
        								new Fromage("gruyere",
        										new Pain("pita",
        											new Assiette())))));
        
        kebabPoisson = new Thon("poisson",
        				new Sauce("sauce algérienne",
        						new Fromage("gruyere",
        								new Oignon("oignon blanc",
        										new Fromage("cheddar",
        												new Oignon("oignon blanc",
        														new Pain("pita",
        																new Assiette())))))));
        
        
        kebabCrevette = new Salade("laitue",
        					new Tomate("tomate rouge",
        							new Crevette ("petite crevette",
        									new Fromage("cheddar",
        											new Sauce("sauce algérienne",
														new Oignon("oignon blanc",
																new Pain("pita",
																		new Assiette())))))));
        
        


    }
    
    //Créer un kebab
    @Test
    public void un_kebab_contient_bien_les_noms_de_tous_les_ingredients_ajoutes() {
    	assertThat(kebabCarnivore.getIngredients()).extracting("nom").
      						containsExactly("pita","oignon blanc", "sauce algérienne", "agneau de pré-salé", "tomate rouge");

    	assertThat(kebabVegetarien.getIngredients()).extracting("nom")
								.containsExactly("pita","gruyere","oignon blanc","tomate rouge","sauce algérienne");
    	
     	assertThat(kebabPoisson.getIngredients()).extracting("nom")
								.containsExactly("pita","oignon blanc","cheddar","oignon blanc","gruyere","sauce algérienne","poisson");
    
     	assertThat(kebabCrevette.getIngredients()).extracting("nom")
		.containsExactly("pita","oignon blanc","sauce algérienne","cheddar","petite crevette","tomate rouge","laitue");
    }


    //Vegetarien
    @Test
    public void isVegetarien_devrait_retourner_vrai_pour_kebabVegetarien() {
        assertThat(kebabVegetarien.isVegetarien()).isTrue();
     }

    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabCarnivore() {
        assertThat(kebabCarnivore.isVegetarien()).isFalse();
    }

    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabPoisson() {
        assertThat(kebabPoisson.isVegetarien()).isFalse();
    }
    
    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabCrevette() {
        assertThat(kebabCrevette.isVegetarien()).isFalse();
    }

    //Pescetarien
    @Test
    public void isPescetarien_devrait_retourner_faux_pour_kebabCarnivore() {
        assertThat(kebabCarnivore.isPescetarien()).isFalse();
    }

    @Test
    public void isPescetarien_devrait_retourner_vrai_pour_kebabVegetarien() {
        assertThat(kebabVegetarien.isPescetarien()).isTrue();
    }

    @Test
    public void isPescetarien_devrait_retourner_vrai_pour_kebabPoisson() {
        assertThat(kebabPoisson.isPescetarien()).isTrue();
    }
    
    @Test
    public void isPescetarien_devrait_retourner_vrai_pour_kebabCrevette() {
        assertThat(kebabCrevette.isPescetarien()).isTrue();
    }

}
