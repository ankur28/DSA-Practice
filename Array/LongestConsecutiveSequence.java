package Array;

import java.util.HashSet;
import java.util.Set;


//link - https://leetcode.com/problems/longest-consecutive-sequence/submissions/1223213577/
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {101, 1,102, 100, 3,2,4};


        System.out.println(longestConsecutive(nums));
    }

    //we always start with the first elemnt of the sequence, so lok for the the starting point of the sequence
    public static int longestConsecutive(int[] nums) {
        int maxSeq = 0;

        Set<Integer> set = new HashSet<>();
// put arry elemnts in set to avoid dupes
        for(int num: nums){
            set.add(num);
        }

        for(int num : nums){
            //looking for a starting number for the sequence. if found then move on to the loop.
            if(!set.contains( num -1)){
                int x = num;
                int count = 1;

                //now if the next consecutive is found the increase the count and move to next
                while(set.contains(x + 1)){
                    x= x+1;
                    count = count + 1;
                }

                maxSeq = Math.max(maxSeq, count);
            }
        }
        return maxSeq;
    }
}

//time com,plexity = O(n) for the arr to set loop, O(2n) for the iterations in second loop so 2n + n = O(3n)