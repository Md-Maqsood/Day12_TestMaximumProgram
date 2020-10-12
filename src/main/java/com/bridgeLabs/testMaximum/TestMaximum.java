package com.bridgeLabs.testMaximum;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum<T extends Comparable<T>> {
	private static Logger logger = LogManager.getLogger(TestMaximum.class);
	List<T> values;

	public TestMaximum(T... values) {
		super();
		this.values = Arrays.asList(values);
	}

	public T testMaximum() {
		return TestMaximum.testMaximum(values);
	}

	public static <T extends Comparable<T>> T testMaximum(List<T> values) {
		T max = values.stream().max((n1, n2) -> n1.compareTo(n2)).orElse(null);
		return max;
	}

	public static void main(String[] args) {
		Integer a = 10, b = 20, c = 15, d = 22;
		TestMaximum<Integer> testMax = new TestMaximum<Integer>(a, b, c, d);
		logger.debug("The maximum in " + a + ", " + b + ", " + c + " and " + d + " is " + testMax.testMaximum());
	}
}
