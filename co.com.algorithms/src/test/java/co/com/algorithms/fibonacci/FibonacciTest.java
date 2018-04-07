package co.com.algorithms.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FibonacciTest {
	private static final int NINTH_FIBONACCI_NUMBER = 34;
	private static final int EIGTH_FIBONACCI_NUMBER = 21;
	private static final int SEVENTH_FIBONACCI_NUMBER = 13;
	private static final int SIXTH_FIBONACCI_NUMBER = 8;
	private static final int FIFTH_FIBONACCI_NUMBER = 5;
	private static final int FOURTH_FIBONACCI_NUMBER = 3;
	private static final int THIRD_FIBONACCI_NUMBER = 2;
	private static final int SECOND_FIBONACCI_NUMBER = 1;
	private Fibonacci fibonacci = new Fibonacci();
	private static final int CERO_NUMBER_OF_SERIE = 0;
	private static final int NINE_NUBER_OF_SERIE = 9;
	private static final int EIGHT_NUMBER_OF_SERIE = 8;
	private static final int SEVEN_NUMBER_OF_SERIE = 7;
	private static final int SIX_NUMBER_OF_SERIE = 6;
	private static final int FIVE_NUMBER_OF_SERIE = 5;
	private static final int FOUR_NUMBER_OF_SERIE = 4;
	private static final int THREE_NUMBER_OF_SERIE = 3;
	private static final int TWO_NUMBER_OF_SERIE = 2;
	private static final int ONE_NUMBER_OF_SERIE = 1;
	private static final int FIRST_FIBONACCI_NUMBER = 1;
	@Test
	void testFibonacciRecursive1() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(ONE_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,FIRST_FIBONACCI_NUMBER);
	}
	@Test
	void testFibonacciRecursive2() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(TWO_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,SECOND_FIBONACCI_NUMBER);
	}
	
	@Test
	void testFibonacciRecursive3() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(THREE_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,THIRD_FIBONACCI_NUMBER);
	}	
	
	@Test
	void testFibonacciRecursive4() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(FOUR_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,FOURTH_FIBONACCI_NUMBER);
	}
	@Test
	void testFibonacciRecursive5() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(FIVE_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,FIFTH_FIBONACCI_NUMBER);
	}
	@Test
	void testFibonacciRecursive6() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(SIX_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,SIXTH_FIBONACCI_NUMBER);
	}
	
	@Test
	void testFibonacciRecursive7() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(SEVEN_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,SEVENTH_FIBONACCI_NUMBER);
	}	
	
	@Test
	void testFibonacciRecursive8() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(EIGHT_NUMBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,EIGTH_FIBONACCI_NUMBER);
	}
	@Test
	void testFibonacciRecursive9() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(NINE_NUBER_OF_SERIE);
		System.out.println(fibonacciNumeber);
		assertEquals(fibonacciNumeber,NINTH_FIBONACCI_NUMBER);
	}	
	@Test
	void testFibonacciRecursive0() {
		int fibonacciNumeber = fibonacci.fibonacciRecursive(CERO_NUMBER_OF_SERIE);
		assertEquals(fibonacciNumeber,FIRST_FIBONACCI_NUMBER);
	}	
	
}
