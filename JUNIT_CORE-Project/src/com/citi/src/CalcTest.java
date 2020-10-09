/**
 * 
 */
package com.citi.src;

import static org.junit.Assert.*;

import org.junit.Test;

import com.citi.spec.Calc;

/**
 * @author indianrenters
 *
 */
public class CalcTest {

//each test method contains @test annotation
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
 public void testAdd()
 {
	 int result = Calc.add(2, 3);
	 assertEquals(5,result);
 }
 @Test
 public void testSub()
 {
	 int result = Calc.sub(8, 3);
	 assertEquals(5,result);
 }
 @Test
 public void testMul()
 {
	int result= Calc.mul(7, 8);
	assertEquals(56,result);
 }
 
@Test
 public void testSin()
 {
	double result= Calc.sinfunc(1);
	assertEquals(0.85,result,0.01);
 }
@Test
 public void testSqrt()
 {
  double result=Calc.sqrtt(2);
  assertEquals(1.415,result,0.001);
 }
}
