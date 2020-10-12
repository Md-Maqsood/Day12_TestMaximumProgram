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
	
	public Float testMaximum(Float a, Float b, Float c) {
		Float maxFloat=0.0f;
		if(a.compareTo(maxFloat)>0) {
			maxFloat=a;
		}
		if(b.compareTo(maxFloat)>0) {
			maxFloat=b;
		}
		if(c.compareTo(maxFloat)>0) {
			maxFloat=c;
		}
		return maxFloat;
	}
	
	public static void main(String[] args) {
		TestMaximum testMax=new TestMaximum();
		Integer a=10, b=20, c=15;
		Integer maxInt=testMax.testMaximum(a, b, c);
		logger.debug("The maximum integer in "+a+", "+b+", "+c+" is "+maxInt);
	}
}
