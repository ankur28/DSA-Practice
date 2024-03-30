import java.util.Arrays;

public class FloorAndCell {

    public static void main(String[] args) {

    int[] arr = {5, 8, 19, 24, 24, 28, 28 };
        System.out.println(Arrays.toString(find(arr, arr.length, 13)));
}

    static int[] find(int[] arr, int n, int x){
        int low= 0;
        int high = n- 1;

        int index =0;

        while( low <= high){
            int mid = (low + high )/2;
            index = mid;


            if(arr[mid] == x)
                return new int[]{ x, x};

            if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        if(index == 0)
            return new int[]{ -1, arr[index]};
        else
            return new int[]{ arr[index], arr[index + 1]};
    }
}
