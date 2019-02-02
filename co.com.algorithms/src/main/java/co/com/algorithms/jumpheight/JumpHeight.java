/**
 * 
 */
package co.com.algorithms.jumpheight;

import java.util.Arrays;

/**
 * @author vin00
 *
 */
public class JumpHeight {

    static int hurdleRace(int k, int[] height) {
        if(height == null || height.length == 0 || k <= 0 || k > 100){
            return 0;
        }
        int dose =0;
        int maxNumber = 0;
        for(int i = 0; i<height.length; i++) {
        	maxNumber = Math.max(maxNumber, height[i]);   	
        }
        dose = maxNumber - k;
        if(dose<0) {
        	dose =0;
        }
        return dose;
    }

    static int hurdleRaceWithSort(int k, int[] height) {
    	    	
        if(height == null || height.length == 0 || k <= 0 || k > 100){
            return 0;
        }
        Arrays.sort(height);
        int dose =0;
        dose = height[height.length-1] - k;
        if(dose<0) {
        	dose =0;
        }
        return dose;
    }    
    
    
    static int hurdleRaceWithStream(int k, int[] height) {
    	return Arrays.stream(height).boxed().filter(d -> d > k).max(Integer::compare).orElse(k).intValue()-k;
    }
}
