import java.util.ArrayList;
import java.util.List;

public class FindNearestFloorElement {
    public static void main(String[] args) {
        int[] arr1 =  {1,2,8,10,11,12,19};
        long[] arr =  {1,2,8,10,11,12,19};
    System.out.println(findFloor(arr,7,12));
    //System.out.println(arraySortedOrNot(arr1, 7));
    }

    // find index of floor element
    static int findFloor(long[] arr , int n  ,long x)
    {
        int ans=-1;
        int l=0, r=n-1;
        while(l<=r){
            long mid=(l+r)/2;
            if(arr[(int) mid]<=x){
                ans= (int) mid;
                l= (int) (mid+1);
            }
            else{
                r= (int) (mid-1);
            }
        }
        return ans;
    }
    static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for(int i = 1;i<n;i++){
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

}
