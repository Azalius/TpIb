package unilim.fr.kebab;

import org.junit.Test;

import junit.framework.Assert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestKebab {
	@Test
	public void testKebabNoVeg()  {
		Assiette keb = new Assiette();
		keb.addIngredient(new Ingredient("saucisoon", false, false));
		assertEquals(keb.isVegan(), false);
	}
	@Test
	public void testKebabnoPescetarien()  {
		Assiette keb = new Assiette();
		keb.addIngredient(new Ingredient("poisson", false, true));
		assertEquals(keb.isVegan(), false);
	}
	@Test
	public void testDoublerFromage()  {
		int nbfromage = 0;
		Assiette keb = new Assiette();
		keb.addIngredient(new Ingredient("poisson", false, true));
		keb.addIngredient(new Ingredient("fromage", true, true));
		keb.doubler(new Ingredient("fromage", true, true));
		for (Iterator<Ingredient> i = keb.getIngredients().iterator(); i.hasNext();){
			Ingredient ing = i.next();
			if (ing.equals(new Ingredient("fromage", true, true))) {
				nbfromage++;
			}
		}
		assertEquals(nbfromage, 2);
	}
	@Test
	public void testEnleverOignon()  {
		int nbfromage = 0;
		Assiette keb = new Assiette();
		keb.addIngredient(new Ingredient("poisson", false, true));
		keb.addIngredient(new Ingredient("oignon", true, true));
		keb.enlever(new Ingredient("oignon", true, true));
		assertEquals(keb.getIngredients().contains(new Ingredient("oignon", true, true)), false);
	}
}
