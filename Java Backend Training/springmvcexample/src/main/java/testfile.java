import static org.junit.Assert.*;

import org.junit.Test;

public class testfile {

	@Test
	public void test() {
		int a=5;
		assertTrue(a<10);
	}
	@Test
	public void test1() {
		String name="wasim";
		String name1="basha";
		assertTrue(name!=name1);
//		assertTrue(name==name1);
//		assertEquals(name,name1);
//		assertSame(name,name1);
	}
}
