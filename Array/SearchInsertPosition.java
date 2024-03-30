package Array;

public class SearchInsertPosition {
    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        System.out.println(searchPosition(arr, 7));
    }

    static int searchPosition(int[] arr, int x){
        int low= 0;
        int high = arr.length- 1;

        int ans =0;

        while( low <= high){
            int mid = (low + high )/2;


            if(arr[mid] == x)
                return mid;

            if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

            if(arr[mid] < x)
                ans = mid + 1;
        }

        return ans;
    }
}
