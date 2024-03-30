package Array.BInarySearch;

public class BinarySearch {
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }

    int binarySearch(int[] arr, int key){
        
        int start = 0;
        int end = arr.length -1 ;

        while (start <= end) {
            int mid = start + ( end - start ) / 2;

            if(arr[mid] == key)
                return mid;

            if(arr[mid] < key)
                start = mid +1;
            else 
                end = mid -1;
        }
        return -1;
    }
}
