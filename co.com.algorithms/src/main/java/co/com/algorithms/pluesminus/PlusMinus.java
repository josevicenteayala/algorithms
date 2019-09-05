/**
 * 
 */
package co.com.algorithms.pluesminus;

import java.text.DecimalFormat;

/**
 * algoritmo que permite contar los ceros, los numeros negativos y los numeros positivos que se encuentran en un arreglo de enteros
 * @author jose
 *
 */
public class PlusMinus {
	private static DecimalFormat numberFormat = new DecimalFormat("#.000000");
	
	public static void plusMinus(int[] numbersArray) {
		int ceroNumbers = 0;
		int negativeNumbers = 0;
		int positiveNumbers = 0;
		
		for(int number: numbersArray) {
			if(number<0) {
				negativeNumbers++;
			}
			if(number>0) {
				positiveNumbers++;
			}
			if(number == 0){
				ceroNumbers++;
			}
		}
		
		System.out.println(numberFormat.format((double)positiveNumbers/numbersArray.length));
		System.out.println(numberFormat.format((double)negativeNumbers/numbersArray.length));
		System.out.println(numberFormat.format((double)ceroNumbers/numbersArray.length));
	}
	
	
}
