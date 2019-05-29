package co.com.algorithms.permutations;

public class Permutation {

	public static <T> void printAllRecursive(int numberOfElements, T[] elements,char delimiter) {
		if(numberOfElements==1) {
			printArray(elements);
		}else {
			for (int i = 0; i < numberOfElements-1; i++) {
				printAllRecursive(numberOfElements-1, elements, delimiter);
				if(numberOfElements % 2 == 0) {
					swap(elements, i, numberOfElements-1);
				}else {
					swap(elements, 0, numberOfElements-1);
				}
			}
		}
	}
	
	private static <T> void printArray(T[] input) {
		System.out.println('\n');
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
	
	private static <T> void swap(T[] input, int positionA, int positionB) {
		T temp = input[positionA];
		input[positionA] = input[positionB];
		input[positionB] = temp;
	}
}
