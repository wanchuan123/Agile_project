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

import code.GradeSystems;
import code.Grades;
import code.NoSuchIDExceptions;

public class testGrades {

	GradeSystems gs;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		gs = new GradeSystems();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateTotalGrade() {
		Grades grades = new Grades("962001051", "李威廷", 81, 98, 87, 90, 93);
		int[] weight = {20, 20, 20, 20, 20};
		int result = grades.calculateTotalGrade(weight);
		assertEquals(89, result, 0.0f);
	}
	
	@Test
	public void testContainsID() {
		String ID = "985002039";
		try {
			assertTrue(gs.containsID(ID));
		} catch (NoSuchIDExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testShowRank() {
		String ID = "985002039";
		final  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		gs.showRank(ID);
		assertEquals("4\r\n", outContent.toString());
	}
	
	@Test
	public void testShowGrade() {
		String ID = "962001051";
		final  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		gs.showGrade(ID);
		assertEquals("90\r\n", outContent.toString());
	}

	@Test
	public void testGetName() {
		String ID = "962001051";
		String name = gs.getName(ID);
		assertEquals("李威廷", name);
	}
	
}
