package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import code.NoSuchCommandExceptions;
import code.NoSuchIDExceptions;
import code.UI;

public class testUI {

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
	public void testUI_positive() {
		try {
			UI ui = new UI();
			boolean result = ui.checkID("11111");
			assertFalse(result);
		} catch (NoSuchIDExceptions | NoSuchCommandExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUI_negative() {
		try {
			UI ui = new UI();
			boolean result = ui.checkID("00001");
			assertTrue(result);
		} catch (NoSuchIDExceptions | NoSuchCommandExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
