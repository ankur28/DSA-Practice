import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7,1,2,1,1,1};
        int n = nums.length;
        int limit = n/2;

        int counter = 0, result = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0;j< n;j++){
                if(nums[i] == nums[j]){
                    counter++;
                }
            }
            if(counter > limit){
                result = nums[i];
                break;
            }
            counter = 0;

        }
        System.out.println(result);
    }
}
