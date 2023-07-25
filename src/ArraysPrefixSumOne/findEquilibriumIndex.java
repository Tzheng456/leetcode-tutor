package ArraysPrefixSumOne;

public class findEquilibriumIndex {
    public static void main(String[] args) {
        int[] nums = new int[]{-7,1,5,2,-4,3,0};
        System.out.println(findEquilibriumIndex(nums));
    }
    public static int findEquilibriumIndex(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];

        // build the PS array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            prefixSum[i] = sum;
        }

        // check that the sum of elements RIGHT of the index (summation PS[i+1, n-1] == PS[n-1] - PS[i])
        // EQUALS sum elements LEFT of the index (summation PS[0, i-1] == PS[i-1])
        for (int i = 1; i < n - 1; i++) {
            int rSum = prefixSum[n - 1] - prefixSum[i];
            int lSum = prefixSum[i - 1];
            if (rSum == lSum) return i;
        }
        // return -1 if no equilibrium found
        return -1;
    }
}
