package Array;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        int n = nums.length;

        int start = 0;
        int p = 0;
         int end = n - 1;
        int temp;

        while(p <= end){
            if( nums[p] == 0){
                temp = nums[p];
                nums[p] = nums[start];
                nums[start] = temp;
                p++;
                start++;
            }else if(nums[p] == 1){
                p++;
            }else{
                temp = nums[p];
                nums[p] = nums[end];
                nums[end] = temp;
               end--;
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
