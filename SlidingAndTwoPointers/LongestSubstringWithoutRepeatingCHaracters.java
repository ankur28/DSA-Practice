package SlidingAndTwoPointers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCHaracters {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int maxLen = Integer.MIN_VALUE;

        //Brute Forece
//        if(s.length() == 0){
//            System.out.println(0);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            Set<Character> set = new HashSet<>();
//            for (int j = i; j < s.length() ; j++) {
//                if(set.contains(s.charAt(j))){
//                    maxLen = Math.max(maxLen, j-i);
//                    break;
//                }
//                set.add(s.charAt(j));
//            }
//        }


        //Two pointer approach

        int l = 0; int r = 0;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int n = s.length();
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }
            map.put(s.charAt(r), r);
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }
        System.out.println(maxLen);
    }
}
