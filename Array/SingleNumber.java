package Array;

import java.util.HashMap;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {3,2,2};
        int flag = 0;
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            flag = 0;
            for (int j = 0; j < n; j++) {
                if ( i != j && nums[i] == nums[j]) {
                    flag = 1;
                    break;
                }

            }
            if(flag == 0)
                result = nums[i];
        }
        System.out.println(result);
    }
}
