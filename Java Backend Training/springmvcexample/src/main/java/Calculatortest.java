import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.howtodoinjava.demo.utility.Calculator;

public class Calculatortest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertTrue(c.add(5,10)==15);
		
	}
	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertTrue(c.sub(5,10)==-5);
	}
	@Test
	public void testMul() {
		Calculator c=new Calculator();
		assertTrue(c.mul(5,10)==50);
	}
	@Test
	public void testDiv() {
		Calculator c=new Calculator();
		assertTrue(c.div(10,5)==2);
	}
}
