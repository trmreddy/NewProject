package ram.learning.jenkin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {
	MyCalculator myCalculator = new MyCalculator();
	@Test
	public void addTest() {
		assertEquals(10,myCalculator.add(5, 5));
	}
	@Test
	public void subTest() {
		assertEquals(10,myCalculator.sub(20, 10));
	}

}
