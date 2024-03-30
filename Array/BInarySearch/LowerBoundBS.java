package Array.BInarySearch;

import java.util.Arrays;

public class LowerBoundBS {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,5};
        System.out.println(findLowerBound(arr, 6, 3));
    }

    static int findLowerBound(int[] arr, int n, int x){ int low= 0;
        int high = n - 1;

        int ans = n;

        while( low <= high){
            int mid = (low + high )/2;

            if(arr[mid] >= x){
                high = mid - 1;
                ans = mid;
            }
            else{
                low = mid + 1;

            }
        }


        return ans;
    }
}
