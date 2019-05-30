/**
 * 
 */
package co.com.algorithms.starsearrays;

import java.util.Arrays;

/**
 * @author vin001
 *
 */
public class SparseArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strings[] = new String[] {"ab","abc","cd","d","ab"};
		String queries[] = new String[] {"ab","abc","cd","e"};
		int resultCount[] = matchingStrings(strings, queries);
		
		System.out.println("SparseArrays.main() "+Arrays.toString(resultCount));
	}

	/**
	 * @param strings
	 * @param queries
	 */
	public static int[] matchingStrings(String[] strings, String[] queries) {
		int resultCount[] = new int[queries.length];
		for(int i = 0; i< strings.length; i++) {
			for(int j =0; j< queries.length; j++) {
				if(strings[i].equals(queries[j])) {
					resultCount[j]+=1;
				}
			}
		}
		return resultCount;
	}

}
