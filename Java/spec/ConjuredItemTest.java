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

	// �s�W���~�G�D�⪺�ӫ~�A�b����餧�e�A�C�L�@�Ѵ�֤G�I�~��
	@Test
	public void conjuredItemDecreaseTwoQualityEverydayBeforeDeadline() {
		items[0] = new Item("Conjured item", 5, 30);

		afterDays(3);
		assertQualityEquals(24, items[0]);
	}

	// �s�W���~�G�D�⪺�ӫ~�A�b����餧��A�C�Ѵ�֥|�I�~��
	@Test
	public void conjuredItemDecreaseFourQualityEveryDayAfterDeadline() {
		items[0] = new Item("Conjured item", 5, 30);

		afterDays(6);
		assertQualityEquals(16, items[0]);
	}

}
