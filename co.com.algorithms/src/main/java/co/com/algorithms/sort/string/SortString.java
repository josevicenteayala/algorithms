package co.com.algorithms.sort.string;

import java.util.Arrays;

public class SortString {

	public String sortString(String chaintToSort) {
		char[] arrays = chaintToSort.toCharArray();
		Arrays.sort(arrays);
		String sorted = new String(arrays);
		return sorted;
	}
	
	public String cleanText(String stringToClean) {
		String stringCleaned = stringToClean.replaceAll("\\s+", "").toString().toLowerCase();
		return stringCleaned;
	}
	
}
