package co.com.algorithms.hourglass;

import java.io.IOException;
import java.util.Arrays;

public class HourGlass {

	public HourGlass() {
	}

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];
        arr[0] = new int[]{0,-4,-6,0,-7,-6};
        arr[1] = new int[]{-1,-2,-6,-8,-3,-1};
        arr[2] = new int[]{-8,-4,-2,-8,-8,-6};
        arr[3] = new int[]{-3,-1,-2,-5,-7,-4};
        arr[4] = new int[]{-3,-5,-3,-6,-6,-6};
        arr[5] = new int[]{-3,-6,0,-8,-6,-7};


        int result = hourGlassSum(arr);
        System.out.println(result);
        
    }

	static int hourGlassSum(int [][] array) {
		int sum = - 63;
		for(int i = 0; i <4;i++) {
			int sumTemp = 0;
			int[] firstRow = array[i];
			int[] secondRow = array[i+1];
			int[] thirdRow = array[i+2];
			System.out.println(Arrays.toString(firstRow));
			System.out.println(Arrays.toString(secondRow));
			System.out.println(Arrays.toString(thirdRow));			
			
			for(int j=0;j<4;j++) {
				sumTemp += firstRow[j]+firstRow[j+1]+firstRow[j+2];
				sumTemp += secondRow[j+1];
				sumTemp += thirdRow[j]+thirdRow[j+1]+thirdRow[j+2];
				int compareSum = Integer.compare(sumTemp, sum);
				if(compareSum>0) {
					sum = sumTemp;
				}
				sumTemp = 0;
			}
			

			System.out.println(sum);
		}
		
		return sum;
	}
	
}
