package com.gildedrose;

public class ConjuredProduct extends Product {

	public ConjuredProduct(Item item) {
		super(item);	
	}

	@Override
	protected void updateQuality() {
		if(item.sellIn == 0) {
			item.quality -= 2;
		} else {
			item.quality -= 1;
		}

		if(item.quality == -1)
			item.quality = 1;
		
		super.updateQuality();
	}
}
