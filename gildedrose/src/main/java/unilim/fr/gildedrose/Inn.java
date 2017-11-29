package unilim.fr.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Inn {
	private static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
	private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
	private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
	private static final String ELIXIR = "Elixir of the Mongoose";
	private static final String BRIE = "Aged Brie";
	private static final String VEST = "+5 Dexterity Vest";
	private List<Item> items;

	public Inn() {
		items = new ArrayList<Item>();
		items.add(new Item(VEST, 10, 20));
		items.add(new Item(BRIE, 2, 0));
		items.add(new Item(ELIXIR, 5, 7));
		items.add(new Item(SULFURAS, 0, 80));
		items.add(new Item(BACKSTAGE_PASSES, 15, 20));
		items.add(new Item(CONJURED_MANA_CAKE, 3, 6));
	}

	public List<Item> getItems() {
		return items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.size(); i++) {
			switch (this.items.get(i).getName()) {
			case BRIE:
				this.increaseQuality(i);
				this.decreaseSellIn(i);
				break;
			case SULFURAS:
				break;
			case BACKSTAGE_PASSES:
				this.decreaseSellIn(i);
				this.backStageQuality(i);
				break;
			case CONJURED_MANA_CAKE:
				decreaseQuality(i); // should be decrease twice but...
				decreaseSellIn(i);
				break;
			default:
				this.decreaseQuality(i);
				this.decreaseSellIn(i);
				break;
			}
		}

	}

	private void decreaseQuality(int item) {
		this.items.get(item).setQuality(this.items.get(item).getQuality()-1);
	}
	
	private void backStageQuality(int item) {
		if (this.items.get(item).getSellIn() == 0) {
			this.items.get(item).setQuality(0);
		}
		else if (this.items.get(item).getSellIn() <= 5) {
			this.increaseQuality(item);
			this.increaseQuality(item);
			this.increaseQuality(item);
		}
		else if (this.items.get(item).getSellIn() <= 10) {
			this.increaseQuality(item);
			this.increaseQuality(item);
		}
		else {
			this.increaseQuality(item);
		}
	}

	private void decreaseSellIn(int item) {
		this.items.get(item).setSellIn(this.items.get(item).getSellIn()-1);
	}

	private void increaseQuality(int item) {
		if (this.items.get(item).getQuality() < 50) {
			this.items.get(item).setQuality(this.items.get(item).getQuality()+1);
		}
	}

	public static void main(String[] args) {
		System.out.println("OMGHAI!");
		new Inn().updateQuality();
	}
}
