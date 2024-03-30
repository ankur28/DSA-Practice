public class FindMinInRottatedArr {
    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr));
    }

    static int search(int[] arr){
        int low= 0;
        int high = arr.length- 1;

        int min = Integer.MAX_VALUE;

        while( low <= high) {
            int mid = (low + high) / 2;
            //check if array is in the correct soreted sequence then pick the first one

            if(arr[low] <= arr[high]){
                min = Math.min(min, arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                min = Math.min(min, arr[low]);
                low = mid+ 1;

            }else{
                min = Math.min(min, arr[mid]);
                high = mid - 1;
                }
            }

        return min;
        }


    }

