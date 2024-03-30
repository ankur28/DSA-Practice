package Array;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int n = nums.length;

        for(int i=0 ; i< n ; i++){
            for(int j = 1 ; j< n-i; j++){
                    if(nums[j-1] > nums[j]){
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                    }
                }



        }
        System.out.println(Arrays.toString(nums));
    }
}
