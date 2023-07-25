package StringsAndHashing;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String a = "this is ib";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(a));
    }

    public static String reverseWords(String s) {
        String reversed = reverse(s);
        StringBuilder sb = new StringBuilder();
        int last = 0;
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == ' ') {
                sb.append(reverse(reversed.substring(last, i + 1)));
                last = i + 1;
            }
            if (i == reversed.length() - 1) {
                sb.append(" ");
                sb.append(reverse(reversed.substring(last, i + 1)));
            }
        }
        return sb.toString();
    }

    public static String reverse(String ss) {
        char[] s = ss.toCharArray();
        int i = 0;
        int j = s.length - 1;
        while (i <= j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
        return new String(s);
    }
}
