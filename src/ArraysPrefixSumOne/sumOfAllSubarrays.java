package ArraysPrefixSumOne;

public class sumOfAllSubarrays {
    public static void main(String[] args) {
//        int[] arr = new int[]{3, 7, 90, 20, 10, 50, 40};
        int[] arr = new int[]{1,2,3,4};
        System.out.println(sumOfAllSubarrays(arr));
    }
    public static int sumOfAllSubarrays(int[] nums) {
        int ans = 0;
        int n = nums.length;
        // for nums[] of length n
        // nums[i] appears in all subarrays beginning with itself - (n - i) times
        // nums[i] appears in all subarrays not beginning with itself - (n - i) * i times
        // so nums[i] appears (n - i) + (n - i) * i times;
        // factor out common (n - i) to get (n - i) * (i + 1) as the number of times nums[i] appears in a subarray
        for (int i = 0; i < n; i++) {
            ans += (nums[i] * (n - i) * (i + 1));
        }
        return ans;
    }
}
