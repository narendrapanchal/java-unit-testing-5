package com.telusko.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc calc=new Calc();
		int result=calc.devide(10, 5);
		System.out.println(result);
		assertEquals(result,2);
	}

}
