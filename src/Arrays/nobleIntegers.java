package Arrays;

import java.util.Arrays;

public class nobleIntegers {
    public static void main(String[] args) {
//        int[] nums = new int[]{7, 3, 16, 10};
        int[] nums = new int[]{1, 2, 3, 4, 5, 2};
        System.out.println(nobleIntegers(nums));
    }
    public static int nobleIntegers(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int countArr[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (nums[i] >= n) {
                countArr[n]++;
            } else {
                countArr[nums[i]]++;
            }
        }
        int greaterCount = countArr[n];
        for (int i = n - 1; i>= 0; i++) {
            if (greaterCount == i && countArr[i] > 0) {
                return i;
            } else if (greaterCount > i) return -1;
            greaterCount += countArr[i];
        }
        return -1;
    }
}
