package com.gildedrose;

public class AgedBrieProduct extends Product {

	public AgedBrieProduct(Item item) {
		super(item);
	}
	
	protected void updateQuality() {
		if (item.quality < 50) {
			item.quality += 1;
		}
	}
	
	protected void updateSellIn() {
		if (item.quality < 50) {
			item.quality += 1;
		}
	}
	
	protected void reduceSellIn() {
		this.item.sellIn -= 1;
	}

}
