package com.gildedrose;

public class BackstageProduct extends Product {

	public BackstageProduct(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {		
		if (item.quality < 50) {
			item.quality += 1;
		
			if (item.sellIn < 11) {
			    if (item.quality < 50) {
			        item.quality += 1;
			    }
			}

			if (item.sellIn < 6) {
			    if (item.quality < 50) {
			        item.quality += 1;
			    }
			}
		}
	}
	
	@Override
	protected void updateSellIn() {
		item.quality -= item.quality;
	}
}
