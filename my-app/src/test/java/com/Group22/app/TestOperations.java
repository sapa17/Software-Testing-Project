package com.Group22.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOperations {
	
	public final Operations ops = new Operations();

	@Test
	public void additionGold() {
		assertEquals(2, ops.Add(1, 1), 0);
	}
	@Test
	public void additionMax() {
		assertEquals(9999999999d, ops.Add(9999999999d, 1), 0);
	}
	@Test
	public void substractGold() {
		assertEquals(1, ops.Sub(1, 2), 0);
	}
	@Test
	public void substractMin() {
		assertEquals(-9999999999d, ops.Sub(-9999999999d, 1), 0);
	}
	@Test
	public void multiplyGold() {
		assertEquals(9, ops.Mul(3, 3), 0);
	}
	@Test
	public void multiplyMax() {
		assertEquals(9999999999d, ops.Mul(9999999999d, 2), 0);
	}
	@Test
	public void multiplyNegative() {
		assertEquals(-9, ops.Mul(3, -3), 0);
	}
	@Test
	public void multiplyNegativeMin() {
		assertEquals(-9999999999d, ops.Mul(-9999999999d, 2), 0);
	}
	@Test
	public void divide() {
		assertEquals(3, ops.Div(9, 3), 0);
	}
	@Test
	public void divideNegative() {
		assertEquals(-3, ops.Div(9, -3), 0);
	}
	@Test
	public void divideZero() {
		assertEquals(null, ops.Div(9, 0));
	}
}
