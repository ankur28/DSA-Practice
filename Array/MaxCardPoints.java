package Array;

public class MaxCardPoints {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;

        int n = cardPoints.length;
        int r= n -1;
        int lsum = 0;
        int rsum = 0;
        int res = 0;

        for (int i = 0; i <= k - 1 ; i++) {
            lsum = lsum + cardPoints[i];
        }
        res = lsum;

        for (int j = k - 1; j >= 0; j--) {
                lsum = lsum - cardPoints[j];
                rsum = rsum + cardPoints[r];
                r--;

                res = Math.max(res, (lsum + rsum));
            }


        System.out.println(res);
    }
}
