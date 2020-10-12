package com.bridgeLabs.testMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void givenMaxIntegerNumberAtPositionOne_ShouldReturnTheSameNumber() {
		Integer a = 20, b = 10, c = 15;
		TestMaximum<Integer> testMax = new TestMaximum<Integer>(a, b, c);
		Integer maxInt = testMax.testMaximum();
		Assert.assertEquals(a, maxInt);
	}

	@Test
	public void givenMaxIntegerNumberAtPositionTwo_ShouldReturnTheSameNumber() {
		Integer a = 10, b = 20, c = 15;
		TestMaximum<Integer> testMax = new TestMaximum<Integer>(a, b, c);
		Integer maxInt = (Integer) testMax.testMaximum();
		Assert.assertEquals(b, maxInt);
	}

	@Test
	public void givenMaxIntegerNumberAtPositionThree_ShouldReturnTheSameNumber() {
		Integer a = 10, b = 15, c = 20;
		TestMaximum<Integer> testMax = new TestMaximum<Integer>(a, b, c);
		Integer maxInt = (Integer) testMax.testMaximum();
		Assert.assertEquals(c, maxInt);
	}

	@Test
	public void givenMaxFloatNumberAtPositionOne_ShouldReturnTheSameNumber() {
		Float a = 2.5f, b = 1.0f, c = 1.5f;
		TestMaximum<Float> testMax = new TestMaximum<Float>(a, b, c);
		Float maxFloat = testMax.testMaximum();
		Assert.assertEquals(a, maxFloat);
	}

	@Test
	public void givenMaxFloatNumberAtPositionTwo_ShouldReturnTheSameNumber() {
		Float a = 1.0f, b = 2.5f, c = 1.5f;
		TestMaximum<Float> testMax = new TestMaximum<Float>(a, b, c);
		Float maxFloat = testMax.testMaximum();
		Assert.assertEquals(b, maxFloat);
	}

	@Test
	public void givenMaxFloatNumberAtPositionThree_ShouldReturnTheSameNumber() {
		Float a = 1.0f, b = 1.5f, c = 2.5f;
		TestMaximum<Float> testMax = new TestMaximum<Float>(a, b, c);
		Float maxFloat = testMax.testMaximum();
		Assert.assertEquals(c, maxFloat);
	}

	@Test
	public void givenMaxStringAtPositionOne_ShouldReturnTheSameString() {
		String a = "Peach", b = "Banana", c = "Apple";
		TestMaximum<String> testMax = new TestMaximum<String>(a, b, c);
		String maxString = testMax.testMaximum();
		Assert.assertEquals(a, maxString);
	}

	@Test
	public void givenMaxStringAtPositionTwo_ShouldReturnTheSameString() {
		String a = "Banana", b = "Peach", c = "Apple";
		TestMaximum<String> testMax = new TestMaximum<String>(a, b, c);
		String maxString = testMax.testMaximum();
		Assert.assertEquals(b, maxString);
	}

	@Test
	public void givenMaxStringAtPositionThree_ShouldReturnTheSameString() {
		String a = "Banana", b = "Apple", c = "Peach";
		TestMaximum<String> testMax = new TestMaximum<String>(a, b, c);
		String maxString = testMax.testMaximum();
		Assert.assertEquals(c, maxString);
	}

	@Test
	public void givenMultipleIntegers_WithMaxIntegerNumberAtPositionOne_ShouldReturnTheSameNumber() {
		Integer a = 25, b = 10, c = 15, d = 20, e = 18, f = 23;
		TestMaximum<Integer> testMax = new TestMaximum<Integer>(a, b, c, d, e, f);
		Integer maxInt = testMax.testMaximum();
		Assert.assertEquals(a, maxInt);
	}

	@Test
	public void givenMultipleFloats_WithMaxFloatNumberAtPositionOne_ShouldReturnTheSameNumber() {
		Float a = 2.5f, b = 1.0f, c = 1.5f, d = 2.0f, e = 1.8f, f = 2.3f;
		TestMaximum<Float> testMax = new TestMaximum<Float>(a, b, c, d, e, f);
		Float maxFloat = testMax.testMaximum();
		Assert.assertEquals(a, maxFloat);
	}

	@Test
	public void givenMultipleStrings_WithMaxStringAtPositionOne_ShouldReturnTheSameString() {
		String a = "Peach", b = "Banana", c = "Apple", d = "Mango", e = "Guava", f = "Orange";
		TestMaximum<String> testMax = new TestMaximum<String>(a, b, c, d, e, f);
		String maxString = testMax.testMaximum();
		Assert.assertEquals(a, maxString);
	}
}
