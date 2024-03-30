public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        int count = 0;
        int [] nums = new int [] {1,2,3};
        int k = 3;
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        System.out.println( count);

    }
}
