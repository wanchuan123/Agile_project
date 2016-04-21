package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import code.GradeSystems;
import code.Grades;

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
		assertTrue(gs.containsID(ID));
	}
	
	@Test
	public void testShowRank() {
		String ID = "985002039";
		assertEquals(4,gs.showRank(ID));
	}

}
