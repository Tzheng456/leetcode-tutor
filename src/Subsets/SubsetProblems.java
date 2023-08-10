package Subsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetProblems {
    public static void main(String[] args) {

    }

    public List<List<Integer>> possibleSubsets(int[] A) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());

        for (int e : A) {
            List<List<Integer>> sub = new ArrayList<>();
            for (List<Integer> current : ans) {
                sub.add(new ArrayList<Integer>(current){{add(e);}});
            }
            for (List<Integer> current : sub) {
                ans.add(current);
            }
        }
        return ans;
    }

//    public boolean subsequenceSumExists(int[] nums) {
//        int n = nums.length;
//        int sum;
//        for (int i = 0; i < Math.pow(2, n); i++) {
//            sum = 0;
//            for (int j = 0; j < n; j++) {
//
//            }
//        }
//    }

    public int[] oddEven(int[] nums) {
        return new int[]{};
    }
}
