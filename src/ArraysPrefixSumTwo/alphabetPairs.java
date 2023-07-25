package ArraysPrefixSumTwo;

public class alphabetPairs {
    public static void main(String[] args) {
//        char[] chars = new char[]{'a','b','c','g','a','g'};
//        char[] chars = new char[]{'a','c','g','d','g','a','g'};
//        char[] chars = new char[]{'b','c','a','g','g','a','a','g'};
        char[] chars = new char[]{'a','c','b','a','g','k','a','g','g'};
        System.out.println("ans: " + countAlphabetPairs(chars));
    }

    public static int countAlphabetPairs(char[] chars) {
        int n = chars.length;
        int sum = 0;
        int[] prefixSum = new int[n];
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'a') sum += 1;
            prefixSum[i] = sum;
        }
//        for (int num : prefixSum) {
//            System.out.println((num));
//        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == 'g') count += prefixSum[i];
        }
        return count;
    }
}
