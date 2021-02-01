import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook g1;
	@BeforeEach
	void setUp() {
		 g1 = new GradeBook(5);

         g1.addScore(50);

         g1.addScore(75);
	}

	@AfterEach
	void tearDown() {
		g1 = null;
	}
	
	@Test
	void testAddScore()  {
		assertFalse(g1.toString().equals("50.0 75.0 "));   
		assertEquals(2.0, g1.getScoreSize(), 0.01);
	}

	@Test
	void testSum() {
		assertEquals(125, g1.sum(), 0.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), 0.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75.0, g1.finalScore(), 0.0001);
	}
	
	
}
