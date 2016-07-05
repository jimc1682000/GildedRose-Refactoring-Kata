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

	// ��x�q���Ҧb���L�����٦��Q�ѥH�W�ɡA�C�@�ѼW�[�@�I�~��
	@Test
	public void ticketItemIncreaseOneQualityEverydayWhenThereIsMoreThanOrEqualsToTenDaysUntilDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(5);
		assertQualityEquals(10, items[0]);
	}

	// ��x�q���Ҧb���L�����٦����ѥH�W�A�����Q�ѮɡA�C�ѼW�[�G�I�~��
	@Test
	public void ticketItemIncreaseTwoQualityEverydayWhenThereIsBetweenFiveToTenDaysUntilDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(10);
		assertQualityEquals(20, items[0]);
	}

	// ��x�q���Ҧb���L���餣�줭�ѮɡA�C�ѼW�[�T�I�~��
	@Test
	public void ticketItemIncreaseThreeQualityEverydayWhenThereIsLessThanFiveDaysUntilDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(15);
		assertQualityEquals(35, items[0]);
	}

	// ��x�q���ҶW�L�L����ɡA�~�謰0
	@Test
	public void qualityOfTicketItemDropToZeroAfterDeadline() {
		items[0] = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 5);

		afterDays(16);
		assertQualityEquals(0, items[0]);
	}

}
