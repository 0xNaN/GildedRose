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
    	Item[] items = new Item[] {new Item("fixme", 0, 10), new Item("Conjured", 0, 10)};
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        
        assertEquals(8, app.items[0].quality);
        assertEquals(6, app.items[1].quality);
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

    @Test
    public void
    backstage_passes_quality_increases_by_3_when_there_are_5_days_or_less() {
    	Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 5, 1) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].quality);
    }
    
    @Test
    public void
    backstage_passes_quality_drops_to_0_after_the_concert() {
    	Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    
    @Test
    public void
    conjured_items_degrade_in_quality_twice_as_fast_as_normal_item() {
    	Item[] items = new Item[] {new Item("Conjured", 1, 10) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }
    
    @Test
    public void
    conjured_items_degrade_in_quality_twice_as_fast_as_normal_item_when_multiple_items() {
    	Item[] items = new Item[] {new Item("foo", 1, 1), new Item("Conjured", 1, 10) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[1].quality);
    }
    
    @Test
    public void 
    conjured_sell_in_decrease_by_one_every_day() {
    	Item[] items = new Item[] {new Item("Conjured", 2, 10) };
    	GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
    }
 
}

