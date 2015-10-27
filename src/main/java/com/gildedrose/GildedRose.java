package com.gildedrose;

import java.util.LinkedList;
import java.util.List;

class GildedRose {
    Item[] items;
    List<Product> products = new LinkedList<Product>();
    
    public GildedRose(Item[] items) {
        this.items = items;
        for(Item item: items) {
        	if(item.name.equals("Aged Brie")) {
        		products.add(new AgedBrieProduct(item));
        	} else if(item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
        		products.add(new BackstageProduct(item));
         	} else if(item.name.equals("Conjured")) {
         		products.add(new ConjuredProduct(item));
         	} else if(item.name.equals("Sulfuras, Hand of Ragnaros")) {
         		products.add(new SulfurasProduct(item));
        	} else {
    			products.add(new Product(item));
        	}
        }
    }

    public void updateQuality() {
    	for(int i = 0; i < items.length; i++) {
    		products.get(i).update();
    		items[i] = products.get(i).getItem();
    	}
    }



}