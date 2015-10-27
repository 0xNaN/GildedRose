package com.gildedrose;

public class SulfurasProduct extends Product {

	public SulfurasProduct(Item item) {
		super(item);
	}

	@Override
	protected void updateQuality() {
		return;
	}
	
	@Override
	protected void updateSellIn() {
		return;
	}
	
	@Override
	protected void reduceSellIn() {
		return;
	}
}
