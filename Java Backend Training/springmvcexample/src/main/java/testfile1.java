import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testfile1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("after test case");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after test file");
	}

	@Before
	public void setUp() throws Exception {
	System.out.println("before each test case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test case");
		int age = 0;
		System.out.println("Your age after test case" +age);
	}
	

	@Test
	public void test() {
//		fail("Not yet implemented");
		int age =10;
		assertTrue(age>5);
		System.out.println("Your Age : "+age);
	}

}
