package com.gildedrose;

public class Product {

	private static final int SELLIN_DEC_FACTOR = 1;
	private static final int QUALITY_DEC_FACTOR = 1;
	protected Item item;

	public Product(Item item) {
		this.item = item;
	}

	protected void update() {
		reduceSellIn();
		updateQuality();
	}

	protected void updateQuality() {
		if(item.sellIn < 0)
			item.quality -= 2 * QUALITY_DEC_FACTOR;
		else
			item.quality -= QUALITY_DEC_FACTOR;
		
		if(item.quality <= 0)
			item.quality = 0;
	}

	protected void reduceSellIn() {
		item.sellIn -=  SELLIN_DEC_FACTOR;
	}

	public Item getItem() {
		return this.item;
	}

}
