package spec;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gildedrose.Item;

public class LegendItemTest extends GeneralItemTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	// 傳奇物品永不到期
	@Test
	public void legendItemNeverExpire() {
		items[0] = new Item("Sulfuras, Hand of Ragnaros", 100, 30);

		afterDays(100);
		assertSellInEquals(100, items[0]);
	}

	// 傳奇物品永不降低品質
	@Test
	public void legendItemNeverChangeQuality() {
		items[0] = new Item("Sulfuras, Hand of Ragnaros", 100, 30);

		afterDays(100);
		assertQualityEquals(30, items[0]);
	}

	// 傳奇就是傳奇
	@Test
	public void legendItemNeverExpireAndChangeQuality() {
		items[0] = new Item("Sulfuras, Hand of Ragnaros", 100, 30);
		afterDays(100);
		assertItemEquals(new Item("Sulfuras, Hand of Ragnaros", 100, 30),
				items[0]);
	}

	// 傳奇物品的品質不可高於50?
	// 傳奇物品的品質不可低於0?
	// 傳奇物品的到期日不可低於0?

}
