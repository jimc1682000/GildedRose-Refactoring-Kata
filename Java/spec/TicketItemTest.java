package spec;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.gildedrose.Item;

public class TicketItemTest extends GeneralItemTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	// 後台通行證在離過期日還有十天以上時，每一天增加一點品質
	@Test
	public void ticketItemIncreaseOneQualityEverydayWhenThereIsMoreThanOrEqualsToTenDaysUntilDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(5);
		assertQualityEquals(10, items[0]);
	}

	// 後台通行證在離過期日還有五天以上，未滿十天時，每天增加二點品質
	@Test
	public void ticketItemIncreaseTwoQualityEverydayWhenThereIsBetweenFiveToTenDaysUntilDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(10);
		assertQualityEquals(20, items[0]);
	}

	// 後台通行證在離過期日不到五天時，每天增加三點品質
	@Test
	public void ticketItemIncreaseThreeQualityEverydayWhenThereIsLessThanFiveDaysUntilDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(15);
		assertQualityEquals(35, items[0]);
	}

	// 後台通行證超過過期日時，品質為0
	@Test
	public void qualityOfTicketItemDropToZeroAfterDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(16);
		assertQualityEquals(0, items[0]);
	}

}
