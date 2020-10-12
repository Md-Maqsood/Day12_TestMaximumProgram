package com.bridgeLabs.testMaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum {
	private static Logger logger = LogManager.getLogger(TestMaximum.class);

	public <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		TestMaximum testMax = new TestMaximum();
		Integer a = 10, b = 20, c = 15;
		Integer maxInt = testMax.testMaximum(a, b, c);
		logger.debug("The maximum integer in " + a + ", " + b + ", " + c + " is " + maxInt);
	}
}
