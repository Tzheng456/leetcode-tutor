package ArraysPrefixSumOne;

public class leastAvgSubarray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 90, 20, 10, 50, 40};
        int k = 3;
//        int[] arr = new int[]{3, 7, 5, 20, -10, 0, 12};
//        int k = 2;
        int[] ans = leastAvgSubarray(arr, k);
        for (int i = 0 ; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] leastAvgSubarray(int[] nums, int k) {
        if (nums.length == 1) {
            return new int[]{0, k - 1};
        }
        double minSum = 0;
        for (int i = 0; i < k; i++) {
            minSum += nums[i];
        }
        double curr = minSum;
        int start = 0;
        for (int i = 1; i <= nums.length - k; i++) {
            curr += nums[i + k - 1] - nums[i - 1];
            if (curr < minSum) {
                start = i;
                minSum = curr;
            }
        }
        return new int[]{start, start + k - 1};
    }
}
