package com.bridgeLabs.testMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void givenMaxIntegerNumberAtPositionOne_ShouldReturnTheSameNumber() {
		TestMaximum testMax = new TestMaximum();
		Integer a = 20, b = 10, c = 15;
		Integer maxInt = testMax.testMaximum(a, b, c);
		Assert.assertEquals(a, maxInt);
	}

	@Test
	public void givenMaxIntegerNumberAtPositionTwo_ShouldReturnTheSameNumber() {
		TestMaximum testMax = new TestMaximum();
		Integer a = 10, b = 20, c = 15;
		Integer maxInt = testMax.testMaximum(a, b, c);
		Assert.assertEquals(b, maxInt);
	}

	@Test
	public void givenMaxIntegerNumberAtPositionThree_ShouldReturnTheSameNumber() {
		TestMaximum testMax = new TestMaximum();
		Integer a = 10, b = 15, c = 20;
		Integer maxInt = testMax.testMaximum(a, b, c);
		Assert.assertEquals(c, maxInt);
	}

	@Test
	public void givenMaxFloatNumberAtPositionOne_ShouldReturnTheSameNumber() {
		TestMaximum testMax = new TestMaximum();
		Float a = 2.5f, b = 1.0f, c = 1.5f;
		Float maxFloat = testMax.testMaximum(a, b, c);
		Assert.assertEquals(a, maxFloat);
	}

	@Test
	public void givenMaxFloatNumberAtPositionTwo_ShouldReturnTheSameNumber() {
		TestMaximum testMax = new TestMaximum();
		Float a = 1.0f, b = 2.5f, c = 1.5f;
		Float maxFloat = testMax.testMaximum(a, b, c);
		Assert.assertEquals(b, maxFloat);
	}

	@Test
	public void givenMaxFloatNumberAtPositionThree_ShouldReturnTheSameNumber() {
		TestMaximum testMax = new TestMaximum();
		Float a = 1.0f, b = 1.5f, c = 2.5f;
		Float maxFloat = testMax.testMaximum(a, b, c);
		Assert.assertEquals(c, maxFloat);
	}
}
