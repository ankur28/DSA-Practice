import java.util.Arrays;

public class RearangeBySign {
    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(reaarange(nums)));
    }
    static int[] reaarange(int[] nums){
        int n = nums.length;
        int[] firstArr = new int[(n/2)];
        int[] secondArr = new int[(n/2)];

        int posCount = 0, negCount = 0;
        for (int val : nums) {
            if(val > 0 ) {
                firstArr[posCount] = val;
                posCount++;
            }else{
                secondArr[negCount] = val;
                negCount++;
            }

        }
        int[] resultArr = new int[n];

        int resCount = 0;
        for (int i=0 ; i < n/2; i++ ){
            resultArr[resCount] = firstArr[i];
            resultArr[resCount+1] = secondArr[i];
            resCount += 2;

        }




        return resultArr;
    }
}
