package SlidingAndTwoPointers;

import java.util.HashMap;

public class CountNumOfNiceSubArrays {
    public static void main(String[] args) {
        int[] nums = { 1,1,2,1,1};
        int k = 2;
        int n = nums.length;
        int countSubArr = 0;
        int sum =0;
        int left = 0; int right = 0;

        while(right < n) {

            if(nums[right]%2==1) sum++;



            while (sum > k){
        if(nums[left] %2 == 1) sum--;
        left++;
       }

       countSubArr += (right - left + 1);
       right++;

        }
        System.out.println(countSubArr);

}}
