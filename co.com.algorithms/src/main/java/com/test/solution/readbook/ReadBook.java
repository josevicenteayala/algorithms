/**
 * 
 */
package com.test.solution.readbook;

/**
 * @author vin00
 *
 */
public class ReadBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ReadBook.main() "+pageCount(7, 4) );

	}
	
	static int smartPageCount(int n, int p) {
        int total = n / 2;
        int right = p / 2;
        int left = total - right;
        if (right < left) {
            return right;
        } else {
            return left;
        }
	}
	   static int pageCount(int n, int p) {
		   int movements = 0;
	        /*
	         * Write your code here.
	         */
	         if(p<0 || p > n || n <1 || n > Math.pow(10, 5)){            
	             return movements;
	         }

	        int movementsFrontToBack =0;
	        int movementsBackToFront = 0;
	        int count = 0;
	        int positionEven = 0;
	        int positionOdd = 1;
	        
	        int positionEvenBack = n;
	        int positionOddBack = positionEvenBack-1;
	        
	        int mod = n % 2;
	        
	        if(mod != 0) {
	        	positionOddBack = n;
	        	positionEvenBack = positionOddBack - 1;
	        	positionEven = 1;
	        	positionOdd = 0;
	        }
	        
	        boolean usedFrontToBack = false;
	        boolean usedBackToFront = false;

	        while(positionOdd < n && positionEvenBack > 1){

	            if (positionEvenBack == p || positionOddBack == p) {
	                movementsBackToFront = count;
	                usedBackToFront = true;
	                break;
	            }

	            if(positionEven == p || positionOdd == p){
	                movementsFrontToBack = count;
	                usedFrontToBack = true;
	                break;
	            }
	            count++;
	            
	            positionEvenBack = n - (count*2);
	            positionOddBack = positionEvenBack+1;
	            
	            positionEven = count *2;
	            positionOdd = positionEven +1; 
	        } 

	        if(usedFrontToBack && usedBackToFront){           
	            if (movementsFrontToBack < movementsBackToFront) {
	                movements = movementsFrontToBack;
	            } else {
	                movements = movementsBackToFront;
	            }
	        }else if(usedFrontToBack){
	            movements = movementsFrontToBack;
	        } else if(usedBackToFront) {            
	            movements = movementsBackToFront;
	        }

	         return movements;
	    }
}
