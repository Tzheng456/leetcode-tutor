package ArraysPrefixSumOne;

public class leftRightMaxArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int[][] ans = leftRightMaxArray(nums);
        for (int i = 0; i < nums.length; i++) {
//            System.out.println(ans[0][i]);
            System.out.println(ans[1][i]);
        }
    }

    public static int[][] leftRightMaxArray(int[] nums) {
        int n = nums.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], nums[i]);
        }
        rMax[0] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], nums[i]);
        }
        return new int[][]{lMax, rMax};
    }
}
