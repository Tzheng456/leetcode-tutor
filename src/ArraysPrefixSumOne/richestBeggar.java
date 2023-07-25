package ArraysPrefixSumOne;

import java.util.ArrayList;

public class richestBeggar {
    public static void main(String[] args) {
        ArrayList<Range> ranges = new ArrayList<>();
        ranges.add(new Range(1,3));
        ranges.add(new Range(2,4));
        ranges.add(new Range(5,6));
        richestBeggar(6, 3, ranges);
    }

    public static void richestBeggar(int n, int k, ArrayList<Range> ranges) {
        int[] beggars = new int[n];
        int[] arr = new int[n];
        for (Range range : ranges) {
            // make ranges 0-indexed
            int l = range.l - 1;
            int r = range.r - 1;
            arr[l] += 1;
            if (r < arr.length - 1) arr[r + 1] += -1;
        }
        int richest = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            beggars[i] = sum;
            richest = Math.max(sum, richest);
        }
        System.out.println(richest);
        String richestBeggars = "";
        for (int i = 0; i < k; i++) {
            if (beggars[i] == richest) richestBeggars = richestBeggars.concat(Integer.toString(i + 1) + " ");
        }
        System.out.println(richestBeggars.substring(0, richestBeggars.length() - 1));
    }

    public static class Range {
        int l;
        int r;
        public Range(int left, int right) {
            l = left;
            r = right;
        }
    }
}

//  1  2  3  4  5  6
//  0  0  0  0  0  0
//  1  1  1  0  0  0
//  0  1  1  1  0  0
//  0  0  0  0  1  1
//  1  2  2  1  1  1
