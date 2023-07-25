package Hashing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,3};
        int k = 3;
//        int[] nums = {1,1,2,2};
//        int k = 1;
    System.out.println(distinctCounter(nums, k));
    }

    public static int distinctCounter(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int n = nums.length;
        for (int i = 0; i < n - k; i++) {
            map.remove(nums[i]);
            map.put(nums[i + k], map.getOrDefault(nums[i + k], 0) + 1);
        }
        return map.size();
    }
}
