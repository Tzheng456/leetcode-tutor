package StringsAndHashing;

import java.util.HashSet;

public class AmazingSubarrays {
    public static void main(String[] args) {
        String s = "ABEC";
        String a = "abadeb";

        System.out.println(amazingSubstrings(s));
        System.out.println(amazingSubstrings(a));
    }
    public static int amazingSubstrings(String s) {
        HashSet<Character> vowels = new HashSet<Character>();
        char[] x = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char v : x) {
            vowels.add(v);
        }
        int count = 0;
        int n = s.length();
        HashSet<Character> seen = new HashSet<Character>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (vowels.contains(c) && !seen.contains(c)) {
                count += (n - i);
                seen.add(c);
            }
        }
        return count;
    }
}