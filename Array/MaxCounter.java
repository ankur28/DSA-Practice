import java.util.Arrays;

public class MaxCounter {

    public static void main(String[] args) {
        int N= 9;
        int[] A = new int[] {1,3,3,7,5,5,9,3,2};
        // Implement your solution here
        int[] resArr = new int[N] ;


        int counter = 0;
        for (int i = 0 ; i <= A.length - 1 ; i++ ){


            if(A[i] == N + 1){
                for (int k= 0 ; k <= resArr.length - 1 ; k++){
                    resArr[k] = counter - 1;
                }
            }else{
                counter++;
                resArr[A[i] - 1] += 1;
            }

        }

        System.out.println(Arrays.toString(resArr));
    }
}

/*

https://app.codesignal.com/get-certified?invite=zeFMeM5iSoEERMXkD
    public int[] solution(int N, int[] A) {
        // Implement your solution here
        int resArr[] = new int[N] ;

        if(A == null ){
            return A;
        }

        int counter = 0;
        for (int i = 0 ; i <= A.length - 1 ; i++ ){


            if(A[i] == N + 1){
                for (int k= 0 ; k <= resArr.length - 1 ; k++){
                    resArr[k] = counter - 1;
                }
            }else{
                counter++;
                resArr[A[i] - 1] += 1;
            }

        }
        return resArr;
    }
*/

