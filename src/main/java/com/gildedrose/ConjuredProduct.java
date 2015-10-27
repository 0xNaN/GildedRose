package com.gildedrose;

public class ConjuredProduct extends Product {

	public ConjuredProduct(Item item) {
		super(item);	
	}

	@Override
	protected void updateQuality() {
		super.updateQuality();
		super.updateQuality();
	}
}
