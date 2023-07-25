package StringsAndHashing;

import java.util.HashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] a = {10, 5, 3, 4, 3, 5, 6};
        int[] b = {6, 10, 5, 4, 9, 120};

        System.out.println(firstRepeating(a));
        System.out.println(firstRepeating(b));
    }

    public static int firstRepeating(int[] arr) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int n : arr) {
            if (!seen.containsKey(n)) seen.put(n, 1);
            else seen.put(n, seen.get(n) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (seen.get(arr[i]) > 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
