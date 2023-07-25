package ArraysPrefixSumTwo;

public class smallestSubarrayContainingMinMax {
    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,1,3,4,6,4,6,3};
//        int[] nums = new int[]{2,2,6,4,5,1,5,2,6,4,1};
//        int[] nums = new int[]{1,6,4,2,7,7,5,1,3,1,1,5};
        int[] nums = new int[]{8,8};
        int ans = smallestSubarrayContainingMinMax(nums);
        System.out.println("ans: " + ans);
    }

    public static int smallestSubarrayContainingMinMax(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        // create ps and label all mins and maxes
        int[] ps = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] == min) ps[i] = min;
            if (nums[i] == max) ps[i] = max;
        }

        // ans initialized to length of array, as that is the largest possible subarray, while we are comparing to any smaller subarray
        int ans = n;
        // check for the subarray length starting at an index containing min first (looking for max next)
        for (int i = 0; i < ps.length; i++) {
            if (ps[i] == min) {
                for (int j = i; j < ps.length; j++) {
                    if (ps[j] == max) {
                        // update to the shortest found length and break
                        ans = Math.min(ans, j - i + 1);
                        break;
                    }
                }
                // check for the subarray length starting at an index containing max first (looking for min next)
            } else if (ps[i] == max) {
                for (int j = i; j < ps.length; j++) {
                    if (ps[j] == min) {
                        // update to the shortest found length and break
                        ans = Math.min(ans, j - i + 1);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
