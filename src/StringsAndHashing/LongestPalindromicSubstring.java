package StringsAndHashing;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String a = "aaaabaaa";
        System.out.println(longestPalindrome(a));
    }
    public static String longestPalindrome(String s) {
        int[] ans = new int[]{0, 0};
        for (int i = 0; i < s.length(); i++) {
            int odd = expand(s, i, i);
            if (odd > ans[1] - ans[0] + 1) {
                int len = odd / 2;
                ans[0] = i - len;
                ans[1] = i + len;
            }
            int even = expand(s, i, i + 1);
            if (even > ans[1] - ans[0] + 1) {
                int len = even / 2 - 1;
                ans[0] = i - len;
                ans[1] = i + len + 1;
            }
        }
        return s.substring(ans[0], ans[1] + 1);
    }

    public static int expand(String s, int start, int end) {
        int i = start;
        int j = end;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}
