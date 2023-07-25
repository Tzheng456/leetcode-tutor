import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println((1 & 0));
//        int a = 6;
//        int b = 0;
//        for (int i = 0; i < 32; i++) {
//            System.out.println("a: " + a + " b: " + b + " i: " + i + " a & (1 << i): " + (a & (1 << i)));
//            if ((a & (i << i)) != 0) {
//                b = i;
//                break;
//            }
//        }
    }

    public static int[] sortedSquares(int[] nums) {
        int left = nums.length / 2;
        int right;
        ArrayList<Integer> ans = new ArrayList<>();
        int[] ansArray = new int[nums.length];

        if (Math.abs(nums[left - 1]) >= Math.abs(nums[left + 1])) {
            right = left + 1;
        } else {
            right = left - 1;
        }

        while (left > 0 && right < nums.length - 1) {
            int lower;
            int higher;
            if (Math.abs(nums[left]) <= Math.abs(nums[right])) {
                lower = left;
                higher = right;
            } else {
                lower = right;
                higher = left;
            }
            ans.add((int) Math.pow(nums[lower--], 2));
            ans.add((int) Math.pow(nums[higher++], 2));
        }
        for (int i = 0; i<ans.size(); i++) {
            ansArray[i] = ans.get(i);
        }
        return ansArray;
    }
}