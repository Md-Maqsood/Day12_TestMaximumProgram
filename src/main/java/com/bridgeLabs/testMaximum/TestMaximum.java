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
		T max = TestMaximum.testMaximum(values);
		printMax(values, max);
		return max;
	}

	public static <T extends Comparable<T>> T testMaximum(List<T> values) {
		T max = values.stream().max((n1, n2) -> n1.compareTo(n2)).orElse(null);
		return max;
	}

	public static <T> void printMax(List<T> values, T max) {
		logger.debug("The maximum of [");
		values.forEach(value -> logger.debug(value + ", "));
		logger.debug("] is " + max + "\n");
	}

	public static void main(String[] args) {
		Integer aInt = 10, bInt = 20, cInt = 15, dInt = 22;
		Float afloat = 2.5f, bfloat = 1.0f, cfloat = 1.5f, dfloat = 2.0f;
		String aString = "Peach", bString = "Banana", cString = "Apple", dString = "Mango";
		new TestMaximum<Float>(afloat, bfloat, cfloat, dfloat).testMaximum();
		new TestMaximum<String>(aString, bString, cString, dString).testMaximum();
		new TestMaximum<Integer>(aInt, bInt, cInt, dInt).testMaximum();
	}
}
