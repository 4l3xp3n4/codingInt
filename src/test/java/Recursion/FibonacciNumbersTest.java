package Recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciNumbersTest {

	@Test
	public void test() {
		FibonacciNumbers fibonnaciGenerator = new RecursiveFibonnacciNumber();
		
		int result = fibonnaciGenerator.getFibbonacciOf(9);
	}

}
