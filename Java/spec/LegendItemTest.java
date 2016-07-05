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

	// �ǩ_���~�ä����
	@Test
	public void legendItemNeverExpire() {
		items[0] = new Item("Sulfuras, Hand of Ragnaros", 100, 30);

		afterDays(100);
		assertSellInEquals(100, items[0]);
	}

	// �ǩ_���~�ä����C�~��
	@Test
	public void legendItemNeverChangeQuality() {
		items[0] = new Item("Sulfuras, Hand of Ragnaros", 100, 30);

		afterDays(100);
		assertQualityEquals(30, items[0]);
	}

	// �ǩ_�N�O�ǩ_
	@Test
	public void legendItemNeverExpireAndChangeQuality() {
		items[0] = new Item("Sulfuras, Hand of Ragnaros", 100, 30);
		afterDays(100);
		assertItemEquals(new Item("Sulfuras, Hand of Ragnaros", 100, 30),
				items[0]);
	}

	// �ǩ_���~���~�褣�i����50?
	// �ǩ_���~���~�褣�i�C��0?
	// �ǩ_���~������餣�i�C��0?

}
