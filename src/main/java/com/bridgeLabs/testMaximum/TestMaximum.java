package com.bridgeLabs.testMaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum<T extends Comparable<T>> {
	private static Logger logger = LogManager.getLogger(TestMaximum.class);
	T a, b, c;

	public TestMaximum(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T testMaximum() {
		return TestMaximum.testMaximum(a, b, c);
	}

	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
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
		Integer a=10, b=20, c=15;
		TestMaximum<Integer> testMax=new TestMaximum<Integer>(a, b, c);
		logger.debug("The maximum in "+a+", "+b+" and "+c+" is "+testMax.testMaximum());
	}
}
