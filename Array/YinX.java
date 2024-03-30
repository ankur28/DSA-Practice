package Array;

public class YinX {
    public static void countIntegers(int X, int Y) {
        int count = 0;
        for (int i = 1; i <= X; i++) {
            int digitSum = sumDigits(i);
            if (digitSum == Y) {
                count++;
            }
        }
        System.out.println(count == 0 ? -1 : count);
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int X = 20; // Replace with the desired value of X
        int Y = 5;   // Replace with the desired value of Y

         countIntegers(X, Y);

    }
}