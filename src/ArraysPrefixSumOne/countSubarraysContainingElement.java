package ArraysPrefixSumOne;

public class countSubarraysContainingElement {
    public static void main(String[] args) {
        int[] arr = new int[]{3, -2, 4, -1, 2, 6};
        System.out.println(countSubarraysContainingElement(arr, 3));
    }

    public static int countSubarraysContainingElement(int[] nums, int idx) {
        int n = nums.length;
        // for nums[] of length n, i = idx
        // nums[i] appears in all subarrays beginning with itself - (n - i) times
        // nums[i] appears in all subarrays not beginning with itself - (n - i) * i times
        // so nums[i] appears (n - i) + (n - i) * i times;
        // factor out common (n - i) to get (n - i) * (i + 1) as the number of times nums[i] appears in a subarray
        return (n - idx) * (1 + idx);
    }
}
