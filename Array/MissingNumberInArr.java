public class MissingNumberInArr {
    public static void main(String[] args) {
        int[] arr1 =  {3,4,5,6,7,9,2,0,1};
        System.out.println(missingNum(arr1));
    }

    static int missingNum(int[] nums){
        int expectedSum = 0;
        int sum = 0;
        int len = nums.length;

        for (int i=0; i<=len; i++){
            expectedSum += i;
        }

        for (int num:nums){
            sum += num;
        }

        int missing = expectedSum-sum;

        return missing;
    }
}
