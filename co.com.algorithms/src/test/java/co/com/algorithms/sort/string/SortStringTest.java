/**
 * 
 */
package co.com.algorithms.sort.string;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author vin00
 *
 */
class SortStringTest {

	@Test
	void testSortString() {
		String chainToSort = "Jose Vicenste Ayala Luna";
		SortString sortString = new SortString();
		String chainSorted = sortString.sortString(chainToSort);
		System.out.println(chainSorted);
		assertTrue(chainSorted.contentEquals("   AJLVaaaceeeilnnosstuy"));
	}
	
	@Test
	void testSortCeleanedString() {
		String chainToSort = "Jose Vicenste Ayala Luna";
		SortString sortString = new SortString();
		String stringCleaned = sortString.cleanText(chainToSort);
		String chainSorted = sortString.sortString(stringCleaned);
		System.out.println(chainSorted);
		assertTrue(chainSorted.contentEquals("aaaaceeeijllnnosstuvy"));
	}
	
	@Test
	void testSortStringNumbers() {
		String chainToSort = "7892315468987";
		SortString sortString = new SortString();
		String chainSorted = sortString.sortString(chainToSort);
		System.out.println(chainSorted);
		assertTrue(chainSorted.contentEquals("1234567788899"));
	}
}
