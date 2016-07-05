package spec;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gildedrose.Item;

public class RegularItemTest extends GeneralItemTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	// 一般物品在銷售截止日到期之前，每過一天減少一點的品質
	@Test
	public void regularItemDecreaseOneQualityEverydayBeforeDeadline() {
		items[0] = new Item("regularItem", 10, 10);

		afterDays(3);
		assertQualityEquals(7, items[0]);
	}

	// 一般物品在銷貨截止日到期之後，每個一天減少二點的品質
	@Test
	public void regularItemDecreaseTwoQualityEverydayAfterDeadline() {
		items[0] = new Item("regularItem", 3, 10);

		afterDays(5);
		assertQualityEquals(3, items[0]);
	}

}
