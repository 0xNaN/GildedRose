package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GildedRoseTest {

    @Test
    public void 
    quality_decrease_by_one_every_day() {
    	Item[] items = new Item[] {new Item("fixme", 2, 10) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
    }
    
    @Test
    public void 
    sell_in_decrease_by_one_every_day() {
    	Item[] items = new Item[] {new Item("fixme", 2, 10) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
    }
    
    @Test
    public void 
    once_the_sell_by_date_has_passed_the_quality_degrades_twice_as_fast() {
    	Item[] items = new Item[] {new Item("fixme", 0, 10) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }
}
