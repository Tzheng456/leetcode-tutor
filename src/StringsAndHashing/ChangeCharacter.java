package StringsAndHashing;

import java.util.HashMap;
import java.util.Arrays;

public class ChangeCharacter {
    public static void main(String[] args) {
        String s = "abcabbccd";
        String a = "abbcd";
        System.out.println(changeChar(a, 3));
        System.out.println(changeChar(s, 3));
    }

    public static int changeChar(String s, int b) {
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!counter.containsKey(c)) {
                counter.put(c, 1);
            } else {
                counter.put(c, counter.get(c) + 1);
            }
        }
        int[] counts = new int[counter.size()];
        int idx = 0;
        for (char k : counter.keySet()) {
            counts[idx++] = counter.get(k);
        }
        Arrays.sort(counts);
        int ans = counts.length;
        idx = 0;
        while (b > 0) {
            b -= counts[idx++];
            ans--;
        }
        return ans;
    }
}
