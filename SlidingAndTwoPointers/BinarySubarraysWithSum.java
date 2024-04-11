package SlidingAndTwoPointers;

import java.util.HashMap;

public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[] arr = { 1,0,1,0,1};
        int goal = 2;
        int l = 0; int r= 0;
        int maxLen  = 0;
      int count = 0;
        //Brute Force
//        for (int i = 0; i < arr.length; i++) {
//            int sum = 0;
//            for (int j = i; j <arr.length; j++) {
//                sum = sum + arr[j];
//                if(sum > goal){
//                    break;
//                }else if (sum == goal){
//                    count++;
//                }
//            }
//
//        }
//        System.out.println(count);
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            sum = sum +arr[i];

            if(sum == goal)
                count++;

            //here we check if if map conatins key  -> sum - goal then update teh count with its value if not then put the sum in the map with default 0 and + 1
            if(map.containsKey(sum - goal))
                count = count + map.get(sum - goal);

                map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        System.out.println(count);

    }
}
