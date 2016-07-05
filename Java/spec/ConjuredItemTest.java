package spec;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gildedrose.Item;

public class ConjuredItemTest extends GeneralItemTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	// 新增物品：求售的商品，在到期日之前，每過一天減少二點品質
	@Test
	public void conjuredItemDecreaseTwoQualityEverydayBeforeDeadline() {
		items[0] = new Item("Conjured item", 5, 30);

		afterDays(3);
		assertQualityEquals(24, items[0]);
	}

	// 新增物品：求售的商品，在到期日之後，每天減少四點品質
	@Test
	public void conjuredItemDecreaseFourQualityEveryDayAfterDeadline() {
		items[0] = new Item("Conjured item", 5, 30);

		afterDays(6);
		assertQualityEquals(16, items[0]);
	}

}
