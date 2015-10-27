package com.gildedrose;

public class Product {

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
			item.quality -= 2;
		else
			item.quality -= 1;
		
		if(item.quality <= 0)
			item.quality = 0;
	}

	protected void reduceSellIn() {
		item.sellIn -=  1;
	}

	public Item getItem() {
		return this.item;
	}

}
