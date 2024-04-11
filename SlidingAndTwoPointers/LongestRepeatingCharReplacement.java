package SlidingAndTwoPointers;

import java.util.HashMap;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int n = s.length();
        int k = 1;

        int l =0;
        int maxfreq = 0;
        int res = 0;
        int windowLen=0;
        int[] arr = new int[26];

        for (int r = 0; r < n; r++) {

            arr[s.charAt(r) - 'A']++;

            maxfreq = Math.max(maxfreq,arr[s.charAt(r) - 'A']);
            windowLen = r-l+1 - maxfreq;

            // Now we check if our current window is valid or not
            if (windowLen > k) {
                // this means the no. of replacements is more than
                // allowed (k)
                // Decrementing the count of the character which was
                // at l because it is no longer in the window
                arr[s.charAt(l) - 'A']--;
                l++;
            }

            // The max our window can be
            res = Math.max(res, r - l + 1);

        }
        System.out.println(res);

    }
}
