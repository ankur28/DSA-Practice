package SlidingAndTwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        int n = s.length();

        int[] arr = new int[3];
        Arrays.fill(arr, -1);


     int count = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            arr[c - 'a'] = i;

            if(arr[0]!= -1 && arr[1] != -1 && arr[2] != -1){
                count = count + (1 + Math.min(arr[0], Math.min(arr[2],arr[1])));
            }

        }


        System.out.println(count);
    }
}
