package Advanced.Arrays;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayProblems {
    public static void main(String[] args) {
//        int[] a = new int[]{123};
//        int[] a = new int[]{199};
//        int[] ans = addOne(a);
//        for(int x : ans) {
//            System.out.print(x);
//        }

//        int[] b = new int[]{1,2,5,-7,2,3};
//        int[] b = new int[]{10,-1,2,3,-4,100};
//        int[] ansB = maxNonNegativeSubarray(b);
//        for(int x : ansB) {
//            System.out.print(x);
//        }
//        int[] nums = new int[]{5,-2,3,1,2};
//        int[] nums = new int[]{1,2};
//        System.out.println(pickFromBothSides(nums, 1));

        int[][] mat = {
                { 0, -2, -7, 0 },
                { 9, 2, -6, 2 },
                { -4, 1, -4, 1 },
                { -1, 8, 0, -2 } };
        System.out.println(maxSumSubMatrixEV1(mat));

    }

    public static int[] addOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }

    public static int[] maxNonNegativeSubarray(int[] nums) {
        int maxSum = 0;
        int currMax = 0;
        int[] bounds = new int[2];
        int s = 0;
        int[] ans = null;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                s = i + 1;
                currMax = 0;
            } else {
                currMax += nums[i];
            }

            if (currMax > maxSum) {
                maxSum = currMax;
                bounds[0] = s;
                bounds[1] = i;
            }
        }
        int idx = 0;
        ans = new int[bounds[1] - bounds[0] + 1];
        for (int i = bounds[0]; i <= bounds[1]; i++) {
            ans[idx++] = nums[i];
        }
        return ans;
    }

    public static int pickFromBothSides(int[] nums, int b) {
        Queue<Integer> front = new LinkedList<>();
        Queue<Integer> back = new LinkedList<>();
        for (int i = 0; i < b; i++) {
            front.add(nums[i]);
        }
        for (int i = nums.length - 1; i >= 0; --i) {
            back.add(nums[i]);
        }
        int ans = 0, count = 0;
        while (count < b) {
            int currFront = front.peek();
            int currBack = back.peek();
            if (currBack >= currFront) {
                ans += back.poll();
            } else {
                ans += front.poll();
            }
            count++;
        }
        return ans;
    }

    public static int maxSumSubMatrixEV3(int[][] mat) {

        return 1;
    }
    public static int maxSumSubMatrixEV1(int[][] mat) {
        int ans = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < mat.length; i++) {
            int currColSum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                currColSum += mat[j][i];
            }
            currentSum += currColSum;
            ans = Math.max(currentSum, ans);
            if (currColSum < 0) currentSum = 0;
        }
        return ans;
    }
    public static int maxSumSubMatrixEV2(int[][] mat) {

        return 1;
    }
}
