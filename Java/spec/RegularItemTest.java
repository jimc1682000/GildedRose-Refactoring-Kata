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

	// �@�몫�~�b�P��I��������e�A�C�L�@�Ѵ�֤@�I���~��
	@Test
	public void regularItemDecreaseOneQualityEverydayBeforeDeadline() {
		items[0] = new Item("regularItem", 10, 10);

		afterDays(3);
		assertQualityEquals(7, items[0]);
	}

	// �@�몫�~�b�P�f�I���������A�C�Ӥ@�Ѵ�֤G�I���~��
	@Test
	public void regularItemDecreaseTwoQualityEverydayAfterDeadline() {
		items[0] = new Item("regularItem", 3, 10);

		afterDays(5);
		assertQualityEquals(3, items[0]);
	}

}
