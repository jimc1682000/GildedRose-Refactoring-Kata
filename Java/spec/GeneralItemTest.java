package spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.gildedrose.GildedRose;
import com.gildedrose.Item;

public class GeneralItemTest {
	GildedRose gr;
	Item[] items;

	@Before
	public void setUp() throws Exception {
		items = new Item[1];
		gr = new GildedRose(items);
	}

	protected void afterDays(int days) {
		for (int i = 0; i < days; i++) {
			gr.updateQuality();
		}
	}

	protected void assertItemEquals(Item expected, Item actual) {
		assertEquals(expected.name, actual.name);
		assertEquals(expected.quality, actual.quality);
		assertEquals(expected.sellIn, actual.sellIn);
	}

	protected void assertQualityEquals(int expectedQuality, Item actual) {
		assertEquals(expectedQuality, actual.quality);
	}

	protected void assertSellInEquals(int expectedSellIn, Item actual) {
		assertEquals(expectedSellIn, actual.sellIn);
	}

	// 所有物品的品質不會是負值
	@Test
	public void allQualityOfItemNeverBeNegative() {
		items[0] = new Item("testItem", 10, 10);

		afterDays(100);
		assertQualityEquals(0, items[0]);
	}

	// 所有物品的品質不會超過50
	@Test
	public void allQualityOfItemNeverGreaterThanFifty() {
		items[0] = new Item("Aged Brie", 10, 10);

		afterDays(100);
		assertQualityEquals(50, items[0]);
	}
}
