package Array;

import java.util.Scanner;

public class TwinPerson
{
    public static void  funcTwins(int[] inputArr)
    {
        int maxVal = Integer.MIN_VALUE;
        for (int num : inputArr) {
            maxVal = Math.max(maxVal, num);
        }
        // Write your code here
        int[] counter = new int[maxVal + 1];
        for( int i : inputArr){
            counter[i]++;
        }

        int not_twin = -1;
        for (int i= 0 ; i < counter.length; i++){
            if(counter[i] == 1){
                not_twin = i;
                break;
            }
        }
        System.out.println(not_twin);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //input for inputArr
        int inputArr_size = in.nextInt();
        int inputArr[] = new int[inputArr_size];
        for(int idx = 0; idx < inputArr_size; idx++)
        {
            inputArr[idx] = in.nextInt();
        }


        funcTwins(inputArr);
    }
}