/**
 * 
 */
package co.com.algorithms.leftrotation;

import java.util.Arrays;

/**
 * @author vin00
 *
 */
public class LeftRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayInts = new int[] {1,2,3,4,5};
		int arrayLength = arrayInts.length;
		int leftRotation = 9;
		int[] finalIntArray = new int[arrayLength];
		
		if(leftRotation > arrayLength) {
			leftRotation = leftRotation % arrayLength;
		}
		
		for(int i = 0;i< arrayInts.length;i++) {
			int position = i-leftRotation;
			if(position<0) {
				position = position +arrayLength;
			}
			finalIntArray[position] = arrayInts[i];
		}
		System.out.println("LeftRotation.main() "+Arrays.toString(finalIntArray));
	}

}
