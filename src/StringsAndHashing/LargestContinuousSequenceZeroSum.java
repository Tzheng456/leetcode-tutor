package StringsAndHashing;

import java.util.HashMap;

public class LargestContinuousSequenceZeroSum {
    public static void main(String[] args) {
        int[] a = {1,2,-2,4,-4};
        int[] b = {15,-2,2,-8,1,7,10,23};
        largestContinuousZeroSumSequence(a);
        largestContinuousZeroSumSequence(b);
    }

    public static int[] largestContinuousZeroSumSequence(int[] nums) {
        int[] bounds = {0,0};
        int longest = 0;
        int sum = 0;

        HashMap<Integer, Integer> sums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum==0) longest = i + 1;
            if (sums.get(sum) != null) {
                longest = Math.max(longest, i - sums.get(sum));
                bounds[0] = i + 1 - longest;
                bounds[1] = i + 1;
            } else {
                sums.put(sum, i);
            }
        }
        int[] ans = new int[longest];
        int idx = 0;
        for (int i = bounds[0]; i < bounds[1]; i++) {
            ans[idx] = nums[i];
            idx++;
        }
        return ans;
    }
}
