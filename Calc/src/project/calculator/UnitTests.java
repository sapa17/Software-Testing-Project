package project.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests {
	
	private final Operations ops = new Operations();

	@Test
	void additionGold() {
		assertEquals(2, ops.Add(1, 1));
	}
	@Test
	void additionMax() {
		assertEquals(9999999999d, ops.Add(9999999999d, 1));
	}
	@Test
	void substractGold() {
		assertEquals(1, ops.Sub(1, 2));
	}
	@Test
	void substractMin() {
		assertEquals(-9999999999d, ops.Sub(-9999999999d, 1));
	}
	@Test
	void multiplyGold() {
		assertEquals(9, ops.Mul(3, 3));
	}
	@Test
	void multiplyMax() {
		assertEquals(9999999999d, ops.Mul(9999999999d, 2));
	}
	@Test
	void multiplyNegative() {
		assertEquals(-9, ops.Mul(3, -3));
	}
	@Test
	void multiplyNegativeMin() {
		assertEquals(-9999999999d, ops.Mul(-9999999999d, 2));
	}
	@Test
	void divide() {
		assertEquals(3, ops.Div(9, 3));
	}
	@Test
	void divideNegative() {
		assertEquals(-3, ops.Div(9, -3));
	}
	@Test
	void divideZero() {
		assertEquals(null, ops.Div(9, 0));
	}
}
