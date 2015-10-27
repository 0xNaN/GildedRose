package com.gildedrose;

public class BackstageProduct extends Product {

	public BackstageProduct(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		if(item.sellIn <= 0) {
			item.quality = 0;
		} else if (item.sellIn <= 5) {
			item.quality += 3;
		} else if (item.sellIn <= 10) {
			item.quality += 2;
		}
	}

}
