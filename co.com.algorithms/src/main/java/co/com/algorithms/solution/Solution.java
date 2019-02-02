package co.com.algorithms.solution;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countMessages' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY keys
     *  2. STRING message
     */

    public static int countMessages(List<String> keys, String message) {
    // Write your code here
        Iterator<String> iterator = keys.iterator();
        Map<Character, Integer> map2 = new HashMap<>();
        Map<Character, Integer> map3 = new HashMap<>();
        Map<Character, Integer> map4 = new HashMap<>();
        Map<Character, Integer> map5 = new HashMap<>();
        Map<Character, Integer> map6 = new HashMap<>();
        Map<Character, Integer> map7 = new HashMap<>();
        Map<Character, Integer> map8 = new HashMap<>();
        Map<Character, Integer> map9 = new HashMap<>();

        int counter = 1;
        String word = null;
        while(iterator.hasNext()){
            String keysPerNumber = iterator.next();
            if(counter == 2){
                fillMap(map2, keysPerNumber);
            }
            if (counter == 3) {
                fillMap(map3, keysPerNumber);
            }
            if (counter == 4) {
                fillMap(map4, keysPerNumber);
            }
            if (counter == 5) {
                fillMap(map5, keysPerNumber);
            }
            if (counter == 6) {
                fillMap(map6, keysPerNumber);
            }
            if (counter == 7) {
                fillMap(map7, keysPerNumber);
            }
            if(counter == 8){
                fillMap(map8, keysPerNumber);
            }
            if (counter == 9) {
                fillMap(map9, keysPerNumber);
            }
            if(counter == 10){
                word = keysPerNumber;
            } 
        }

        char[] wordChar = word.toCharArray();
        StringBuilder numbers = new StringBuilder();

        for(int k = 0; k <wordChar.length;k++){
            fillNumberLine(map2, wordChar, numbers, k);
        }

        return 0;
    }


	private static void fillNumberLine(Map<Character, Integer> map2, char[] wordChar, StringBuilder numberBuilder, int k) {
		if(map2.containsKey(wordChar[k])){
		    Integer position = map2.get(wordChar[k]);
		    if(position == 1){
		        numberBuilder.append(2);
		    }
		    if (position == 2) {
		        numberBuilder.append(2);
		        numberBuilder.append(2);
		    }
		    if (position == 3) {
		        numberBuilder.append(2);
		        numberBuilder.append(2);
		        numberBuilder.append(2);
		    }
		    if (position == 4) {
		        numberBuilder.append(2);
		        numberBuilder.append(2);
		        numberBuilder.append(2);
		        numberBuilder.append(2);
		    }
		    
		}
	}


    public static void fillMap(Map<Character,Integer> map, String keysPerNumber){
        char[] charArray = keysPerNumber.toCharArray();
        for (int j = 0; j < charArray.length; j++) {
            map.put(charArray[j], j+1);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int keysCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> keys = IntStream.range(0, keysCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        String message = bufferedReader.readLine();

        int result = Result.countMessages(keys, message);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
