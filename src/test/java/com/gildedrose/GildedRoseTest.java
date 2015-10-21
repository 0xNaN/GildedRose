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
    
    @Test
    public void
    the_quality_of_an_item_is_never_negative () {
    	Item[] items = new Item[] {new Item("fixme", 1, 0) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    
    @Test
    public void
    aged_brie_actually_increases_in_quality_the_older_it_gets() {
    	Item[] items = new Item[] {new Item("Aged Brie", 1, 0) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }
    
    @Test
    public void
    the_quality_of_an_item_is_never_more_than_50() {
    	Item[] items = new Item[] {new Item("Aged Brie", 1, 50) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }
    
    @Test
    public void
    sulfuras_never_decreases_in_quality() {
    	Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 1, 50) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }
    
    @Test
    public void
    backstage_passes_quality_increases_by_2_when_there_are_10_days_or_less() {
    	Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 1) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }
    
//    "Backstage passes", like aged brie, increases in Quality as it's SellIn value approaches;
//   	Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
//   	Quality drops to 0 after the concert
//    
//    
    
}

