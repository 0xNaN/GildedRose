package com.gildedrose;

public class Product {

	protected Item item;

	public Product(Item item) {
		this.item = item;
	}

	protected void update() {
		updateQuality();
		reduceSellIn();
		if (item.sellIn < 0) {
			updateSellIn();
		}
	}

	protected void updateQuality() {
		if (item.quality > 0) {
			item.quality -=  1;
		}
	}

	protected void updateSellIn() {
		if (item.quality > 0) {
			item.quality -= 1;
		}

	}

	protected void reduceSellIn() {
		item.sellIn -=  1;
	}

	public Item getItem() {
		return this.item;
	}

}
