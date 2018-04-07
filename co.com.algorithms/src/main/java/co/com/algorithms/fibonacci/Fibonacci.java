package co.com.algorithms.fibonacci;

public class Fibonacci {
	
	public int fibonacciRecursive(int quantityOfNumbersToReturn) {
		
		if(quantityOfNumbersToReturn <= 2) {
			return 1;
		}
		return fibonacciRecursive(quantityOfNumbersToReturn-1) + fibonacciRecursive(quantityOfNumbersToReturn-2);
	}
	
	
}
