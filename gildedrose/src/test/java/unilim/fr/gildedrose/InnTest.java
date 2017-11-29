package unilim.fr.gildedrose;

import org.junit.Test;

import junit.framework.Assert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InnTest {
	private static final int nbJour = 100;
	@Test
	public void testOnInn() throws Exception {
		LegacyInn lInn = new LegacyInn();
		Inn inn = new Inn();
		int i, j;
		i=0;
		j=0;
		try {
			for (i = 0 ; i < nbJour ; i++) {
				for (j = 0 ; j < lInn.getItems().size() ; j++) {
					Assert.assertEquals(inn.getItems().get(j).getName(), lInn.getItems().get(j).getName());
					Assert.assertEquals(inn.getItems().get(j).getSellIn(), lInn.getItems().get(j).getSellIn());
					Assert.assertEquals(inn.getItems().get(j).getQuality(), lInn.getItems().get(j).getQuality());
				}
			inn.updateQuality();
			lInn.updateQuality();
			}
		} catch (Throwable e){
			throw new Exception("jour "+ i  + " produit "+ lInn.getItems().get(j).getName() + " " + e);
		}
	}
}