package StringsAndHashing;

public class SimpleReverse {
    public static void main(String[] args) {
        String s = "scalar";
        String a = "academy";
        String reversedS = simpleReverse(s);
        String reversedA = simpleReverse(a);
        System.out.println(reversedS + " " + reversedA);
    }
    public static String simpleReverse(String s) {
        char[] ans = s.toCharArray();
        int i = 0;
        int j = ans.length - 1;
        while (i <= j) {
            char tmp = ans[i];
            ans[i] = ans[j];
            ans[j] = tmp;
            i++;
            j--;
        }
        return new String(ans);
    }
}
