import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] nums = new int[]{0,1,0,3,12};
        int n = nums.length;
        for(int i = 0; i< n-1 ; i++){
            for(int j = i+1 ; j <= n-1; j++){
                if (nums[i] == 0 && nums[j] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
    }
        System.out.println(Arrays.toString(nums));


    }}
