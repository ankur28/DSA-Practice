package Array.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]){
     /*   int[] unsorted = {32, 39,21, 45, 23, 3};
        bubbleSort(unsorted);*/
        int[] test = { 5, 3, 2, 1,0,14};
        bubbleSort(test);
    }

    public static void bubbleSort(int[] arr){
        int length = arr.length;
//compare first element with next element, if the first elemetn is greater than next one, then swap , and repeat
        for (int i = 0 ; i < length-1 ; i++){
            for(int j = 1 ; j< length - i ; j++ ){
                if (arr[j-1] > arr[j]){
                    int temp  = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
