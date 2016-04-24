package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import code.NoSuchCommandExceptions;
import code.NoSuchIDExceptions;
import code.UI;

public class testUI {

	private static UI ui;
	@BeforeClass
	public static void setUpBeforeClass() throws NoSuchIDExceptions, NoSuchCommandExceptions {
		ui = new UI();
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
	public void testUIExit() {
		final ByteArrayInputStream  inContent = new ByteArrayInputStream("Q". getBytes());
		System.setIn (inContent);
	}
	
	@Test(expected = NoSuchIDExceptions.class)
	public void testUI_negative() throws NoSuchIDExceptions {
		boolean result = ui.checkID("11111");
	}
	
	@Test
	public void testUI_positive() {
		try {
			boolean result = ui.checkID("955002056");
			assertTrue(result);
		} catch (NoSuchIDExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testShowFinishMsg() {
		final  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		ui.showFinishMsg();
		assertEquals("結束了", outContent.toString());
	}
	
	@Test
	public void testShowWelcomeMsg() {
		String ID = "962001051";
		final  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		ui.showWelcomeMsg(ID);
		assertEquals("Welcome 李威廷\r\n", outContent.toString());
	}

}
