package Arrays;

import java.util.ArrayList;

public class leadersInArray {
    public static void main(String[] args) {
        int[] nums = new int[]{16, 17, 4, 3, 5, 2};
//        int[] nums = new int[]{1, 2, 3, 4, 5, 2};
        leadersInArray(nums);
    }

    public static void leadersInArray(int[] nums) {
        // initialize leaders list and add the right-most element of nums as the currentLeader
        ArrayList<Integer> leaders = new ArrayList<>();
        int currentLeader = nums[nums.length - 1];
        leaders.add(currentLeader);

        // check rest of nums elements from second right-most element to first element going from right to left
        // if the element is greater than currentLeader, add it to leaders and update currentLeader to be that element
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > currentLeader) {
                leaders.add(nums[i]);
                currentLeader = nums[i];
            }
        }

        // print the leaders in reverse and exclude appending ", " for the first element
        for (int i = leaders.size() - 1; i >= 0; i--) {
            if (i > 0) System.out.print(leaders.get(i) + ", ");
            else System.out.print(leaders.get(i));
        }
    }
}
