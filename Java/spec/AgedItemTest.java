package spec;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gildedrose.Item;

public class AgedItemTest extends GeneralItemTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	// 陳年物品的品質在過期前每天加一
	@Test
	public void agedItemIncreaseOneQualityEverydayBeforeExpiredDate() {
		items[0] = new Item("Aged Brie", 10, 10);

		afterDays(5);
		assertQualityEquals(15, items[0]);
	}

	// 陳年物品的品質在過期後每天加二
	@Test
	public void agedItemIncreaseTwoQualityEveryDayAfterExpiredDate() {
		items[0] = new Item("Aged Brie", 10, 10);

		afterDays(15);
		assertQualityEquals(30, items[0]);
	}

}
