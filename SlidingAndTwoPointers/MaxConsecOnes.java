package SlidingAndTwoPointers;

public class MaxConsecOnes {
    public static void main(String[] args) {

//
//        int l = 0;
//        int r = 0;
//        int maxLen = Integer.MIN_VALUE;
//        int flipCount = 0;
//
//        while(r <n){
//            if(arr.get(r) == 0){
//
//                flipCount++;
//
//            }
//
//
//            if(flipCount > k){
//
//                l = l +1;
//                r=l;
//                flipCount = 0;
//
//            }else{
//                maxLen = Math.max(maxLen , r-l+1);
//
//                r++;
//            }
//
//        }
//        return maxLen;
//    }
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int n = nums.length;
        int k = 3;

        int l = 0;
        int r = 0;
        int maxLen = 0;
        int flipCount = 0;

        while(r <n){
            if(nums[r] == 0){

                flipCount++;

            }

        while( flipCount > k){
            if(nums[l] == 0){
                flipCount--;
            }
            l = l +1;
        }
            maxLen = Math.max(maxLen, r - l + 1);

        r++;
        }
        System.out.println(maxLen);
    }
}
