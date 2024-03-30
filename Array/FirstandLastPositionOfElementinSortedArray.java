import java.util.Arrays;

public class FirstandLastPositionOfElementinSortedArray {

    public static void main(String[] args) {
        int[] res = new int[2];
        int[] arr =  {5,7,7,8,8,10};

        res[0] = searchFirst(arr, 8);
        res[1] = searchLast(arr, 8);
        System.out.println(Arrays.toString(res));
    }


    static int searchFirst(int[] nums, int target){
        int left = 0; // left index
        int right = nums.length - 1; // right index
        int index = -1; // index of the first occurrence

        while(left <= right){

            int mid = left + (right - left) / 2; // calculate the mid index

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] < target){
                left = mid; // search in the right half
            }
            else{
                right = mid - 1; // search in the left half
            }
        }

        return index;
    }

    // binary search to find the last occurrence of the target
    static int searchLast(int[] nums, int target){
        int left = 0; // left index
        int right = nums.length - 1; // right index
        int index = -1; // index of the last occurrence

        while(left <= right){

            int mid = left + (right - left) / 2; // calculate the mid index

            if(nums[mid] == target){
                return mid + 1;
            }

            else if(nums[mid] < target){
                left = mid; // search in the right half
            }
            else{
                right = mid - 1; // search in the left half
            }
        }

        return index;
    }

}
