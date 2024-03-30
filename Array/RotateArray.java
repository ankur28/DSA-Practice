package Array;/*
* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
:*/


import java.sql.Array;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int arr[] = new int[]{1,2,3,4,5,6,7};

        rotate_arr(arr, 3);
    }

    // this solution wiill cause time limit exceeded err for larger arrays
//    static void rotate_arr(int[] arr, int k){
//
//        int len = arr.length;
//        if(k > len){
//            k = k% len;
//        }
//
//        while(k > 0){
//            int temp = arr[len - 1];
//
//            for(int i = len - 1 ; i >=1 ; i --){
//
//                arr[i] = arr[i - 1];
//            }
//            arr[0] = temp;
//            k--;
//
//        }
//
//
//        System.out.println(Arrays.toString(arr));
//
//    }

    //  1,2,3,4,5,6,7


        static void rotate_arr(int[] arr, int k) {
            int len = arr.length;
            k = k % len;

            reverse(arr, 0, len - 1); // Reverse the entire array
            reverse(arr, 0, k - 1);   // Reverse the first k elements
            reverse(arr, k, len - 1); // Reverse the remaining elements

            System.out.println(Arrays.toString(arr));
        }

        static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

