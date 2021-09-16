package com.junitss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jenk.MyCalculator;

public class MyCalculatorTest {

	@Test
	public void test() {
		assertEquals(10, new MyCalculator().getSum(5,5));
	}
	
	@Test
	public void test2() {
		assertEquals(20, new MyCalculator().getSum(15,5));
	}


}
