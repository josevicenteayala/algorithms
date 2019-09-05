/**
 * 
 */
package co.com.algorithms.pluesminus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author jose
 *
 */
class PlusMinusTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link co.com.algorithms.pluesminus.PlusMinus#plusMinus(int[])}.
	 */
	@Test
	void testPlusMinus() {
		PlusMinus.plusMinus(new int[] {-4,3, -9, 0, 4, 1});
	}

}
