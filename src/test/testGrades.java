package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import code.Grades;

public class testGrades {

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
	public void testCalculateTotalGrade() {
		Grades grades = new Grades("0001", "¤ý¤p©ú", 81, 98, 87, 90, 93);
		int[] weight = {20, 20, 20, 20, 20};
		int result = grades.calculateTotalGrade(weight);
		assertEquals(89, result, 0.0f);
	}

}
