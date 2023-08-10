package Advanced.Arrays;

public class ArrayProblems {
    public static void main(String[] args) {
//        int[] a = new int[]{123};
        int[] a = new int[]{199};
        int[] ans = addOne(a);
//        for(int x : ans) {
//            System.out.print(x);
//        }

//        int[] b = new int[]{1,2,5,-7,2,3};
        int[] b = new int[]{10,-1,2,3,-4,100};
        int[] ansB = maxNonNegativeSubarray(b);
        for(int x : ansB) {
            System.out.print(x);
        }
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
}
