package co.com.algorithms.permutations;

import org.junit.jupiter.api.Test;

class PermutationTest<E> {

	@SuppressWarnings("unchecked")
	@Test
	void testPrintAllRecursive() {
		Integer[] arrayOfInts = {2,9,6};
		E[] arrayOfElements = (E[])new Object[arrayOfInts.length];
		for (int i = 0; i < arrayOfInts.length; i++) {
			arrayOfElements[i] = (E)arrayOfInts[i];
		}
		Permutation.printAllRecursive(arrayOfInts.length, arrayOfElements, ',');
	}

}
