package Array;
//link - https://www.naukri.com/code360/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
import java.util.*;

public class SuperiorElements {
    public static void main(String[] args) {
        int nums[] = {187,64 ,133, 62 ,49 ,163 ,50 ,115, 42 ,65 ,60 ,49, 32, 87, 141 ,142 ,146, 159};
        //int[] nums = {1,8,1,0,3,2};
        System.out.println(find(nums));
    }
    static List< Integer > find(int[] nums){
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        int max = nums[n - 1];

        for (int i = n -2; i >= 0 ; i--) {
            if(nums[i] > max){
                res.add(nums[i]);
                max = nums[i];
            }
        }


        // Sort the result in ascending order
        if(!res.contains(nums[n-1]))
            res.add(nums[n-1]);

        Collections.sort(res);
        return res;
    }
}
