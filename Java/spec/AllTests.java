package spec;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
// 一開始不包含ConjuredItemTest.class
@SuiteClasses({ GeneralItemTest.class, LegendItemTest.class,
		RegularItemTest.class, TicketItemTest.class, AgedItemTest.class })
public class AllTests {
}
