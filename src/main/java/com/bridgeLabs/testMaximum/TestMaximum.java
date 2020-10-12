package com.bridgeLabs.testMaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum {
	private static Logger logger=LogManager.getLogger(TestMaximum.class);

	public Integer testMaximum(Integer a, Integer b, Integer c) {
		Integer maxInt=0;
		if(a.compareTo(maxInt)>0) {
			maxInt=a;
		}
		if(b.compareTo(maxInt)>0) {
			maxInt=b;
		}
		if(c.compareTo(maxInt)>0) {
			maxInt=c;
		}
		return maxInt;
	}
}
