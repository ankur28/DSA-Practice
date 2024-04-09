package Array;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        int[][] resMatrix = new int[matrix.length][matrix[0].length];
        int n = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                resMatrix[i][j] = matrix[i][j];
            }
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = 0; j < matrix[i].length ; j++) {
                if(matrix[i][j] == 0){

                    int rightPointer = j;
                    // move from point to right
                        while (rightPointer <= resMatrix[i].length) {
                            if (resMatrix[i][rightPointer] != 0)
                                resMatrix[i][rightPointer] = 0;

                            rightPointer++;

                            if (rightPointer == resMatrix[i].length)
                                break;
                        }


                    // move from point to left
                    int leftPointer = j;

                    while(leftPointer >= 0  ){
                        if(resMatrix[i][leftPointer] != 0)
                            resMatrix[i][leftPointer] = 0;

                        leftPointer--;

                        if(leftPointer < 0 )
                            break;
                    }

                    int bottomPointer = i;
                    while(bottomPointer < resMatrix.length){
                        if(resMatrix[bottomPointer][j] != 0)
                            resMatrix[bottomPointer][j] = 0;

                        bottomPointer++;
                    }

                    int topPointer = i;
                    while(topPointer >= 0){
                        if(resMatrix[topPointer][j] != 0)
                            resMatrix[topPointer][j] = 0;

                        topPointer--;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((resMatrix[i][j]));
            }
            System.out.println();
        }

    }
}
