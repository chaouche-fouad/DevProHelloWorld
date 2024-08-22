package pkg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pkg.GuessingGame.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class GuessingGameTest {
	
	@Test
	public void comparisonShouldBeAccurate() {
		assertEquals(reportComparison(23,23,7),"Correct in 7 times");
		assertEquals(reportComparison(84,99,4),"Too low : ");
		assertEquals(reportComparison(75,22,1),"Too high : ");
	}
	@Test
	public void inputLess100Greater0() {
		assertFalse(isInvalidInput(1));
		assertFalse(isInvalidInput(100));
		assertFalse(isInvalidInput(0));
		assertFalse(isInvalidInput(37));
		assertTrue(isInvalidInput(-1));
		assertTrue(isInvalidInput(-.5));
		assertTrue(isInvalidInput(101));
		assertTrue(isInvalidInput(.75));
	}
	
	@Test
	public void gameShouldContinueUntilGuessed() {
		
		assertTrue(notGuessed(23,26));
		assertTrue(notGuessed(99,100));
		assertFalse(notGuessed(23,23));
	}
	/*@After
	public void doAfter() {
		System.out.println("Run s After every test");
	}
	@Before
	public void doBefore() {
		System.out.println("Run s Before every test");
	}*/
	
	
	
	 
	

}
