package com.bridgeLabs.testMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {

	@Test
	public void givenMaxIntegerNumberAtPositionOne_ShouldReturnTheSameNumber() {
		TestMaximum testMax=new TestMaximum();
		Integer a=20, b=10, c=15;
		Integer maxInt=testMax.testMaximum(a,b,c);
		Assert.assertEquals(a,maxInt);
	}
}
