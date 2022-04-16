/**
*
* Student name:  xxxxx
* Completion date: xxxx
*
* TriangleTest.txt: the template file of TriangleTest.java
* Student tasks: 
* - Write 20 JUnit test cases for Triangle class 
* - Then run this file on the command line with the jar files provided
*
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class ZachBoudreauxTriangleTest {

	@Test
	public void test1(){
		Triangle triangle = new Triangle("12","12","12");
		assertEquals("This is an equilateral triangle. ",triangle.triangleType());	
	}//end test
	
	@Test
	public void test2(){
		Triangle triangle = new Triangle("3","3","5");
		assertEquals("This is an isosceles triangle. ",triangle.triangleType());
	 	
	}//end test
	
	@Test
	public void test3(){
		Triangle triangle = new Triangle("4","5","6");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());
		// expected value: "This is a scalene triangle. "  
		// value returned from the method: triangle.triangleType() 
	}//end test
	
	@Test
	public void test4(){
		Triangle triangle = new Triangle("not a number", "5", "6");
		assertTrue(triangle.triangleType().contains("The side 1 is not an integer number."));   
		// change above arguments(true, true) to (expectedValue, valueReturned)
	}//end test

	@Test
	public void test5(){
		Triangle triangle = new Triangle("4", "not a number", "6");
		assertTrue(triangle.triangleType().contains("The side 2 is not an integer number."));  
	}//end test
	
	@Test
	public void test6(){
		Triangle triangle = new Triangle("4", "5", "not a number");
		assertTrue(triangle.triangleType().contains("The side 3 is not an integer number."));  
	}//end test
	
	@Test
	public void test7(){
		Triangle triangle = new Triangle("-5", "5", "6");
		assertTrue(triangle.triangleType().contains("At least one side is negative"));
	}//end test
	
	@Test
	public void test8(){
		Triangle triangle = new Triangle("5", "-10", "6");
		assertTrue(triangle.triangleType().contains("At least one side is negative"));
	}//end test
	
	@Test
	public void test9(){
		Triangle triangle = new Triangle("5", "5", "-10");
		assertTrue(triangle.triangleType().contains("At least one side is negative"));
	}//end test
	
	@Test
	public void test10(){
		Triangle triangle = new Triangle("1", "2", "10");
		assertTrue(triangle.triangleType().contains("Not a valid triangle"));
	}//end test	
	
	@Test
	public void test11(){
		Triangle triangle = new Triangle("1", "10", "2");
		assertTrue(triangle.triangleType().contains("Not a valid triangle"));
	}//end test
	
	@Test
	public void test12(){
		Triangle triangle = new Triangle("10", "1", "2");
		assertTrue(triangle.triangleType().contains("Not a valid triangle"));
	}//end test
	
	@Test
	public void test13(){
		Triangle triangle = new Triangle("1000", "2", "10");
		assertTrue(triangle.triangleType().contains("This triangle is too big"));
	}//end test
	
	@Test
	public void test14(){
		Triangle triangle = new Triangle("1", "1000", "3");
		assertTrue(triangle.triangleType().contains("This triangle is too big"));
	}//end test
	
	@Test
	public void test15(){
		Triangle triangle = new Triangle("1", "2", "1000");
		assertTrue(triangle.triangleType().contains("This triangle is too big"));
	}//end test
	
	@Test
	public void test16(){
		Triangle triangle = new Triangle("-1", "2", "1000");
		assertEquals("At least one side is negative!\nNot a valid triangle!\nThis triangle is too big.\n", triangle.triangleType());
	}//end test	
	
	@Test
	public void test17(){
		Triangle triangle = new Triangle("1000", "500", "1");
		assertEquals("Not a valid triangle!\nThis triangle is too big.\n", triangle.triangleType());
	}//end test
	
	
	@Test
	public void test18(){
		Triangle triangle = new Triangle("200", "200", "200");
		assertEquals("This is an equilateral triangle. ", triangle.triangleType());
	}//end test	
	
	
	@Test
	public void test19(){
		Triangle triangle = new Triangle("200", "200", "300");
		assertEquals("This is an isosceles triangle. ", triangle.triangleType());
	}//end test
	
	@Test
	public void test20(){
		Triangle triangle = new Triangle("2", "3", "4");
		assertEquals("This is a scalene triangle. ", triangle.triangleType());	
	}//end test

}
