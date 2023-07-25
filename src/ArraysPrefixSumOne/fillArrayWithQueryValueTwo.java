package ArraysPrefixSumOne;

import java.util.ArrayList;

public class fillArrayWithQueryValueTwo {
    public static void main(String[] args) {
        int[] nums = new int[6];
        ArrayList<Query> queries = new ArrayList<>();
        queries.add(new Query(2,4,2));
        queries.add(new Query(1,3,1));
        queries.add(new Query(0,3,5));
        int[] ans = fillArrayWithQueryValueTwo(nums, queries);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] fillArrayWithQueryValueTwo(int[] nums, ArrayList<Query> queries) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] ans = new int[n];
        for (Query query : queries) {
            arr[query.start] += query.val;
            arr[query.end + 1] += query.val * -1;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans[i] = sum;
        }

        return ans;
    }

    public static class Query {
        int start;
        int end;
        int val;
        public Query(int s, int e, int v) {
            start = s;
            end = e;
            val = v;
        }
    }
}

// 0  1  2  3  4  5
// 0  0  0  0  0  0
// 0  0  2  0  0 -2
// 0  1  0  0 -1  0
// 5  0  0  0 -5  0
// 5  1  2  0 -6 -2
// 5  6  8  8  2  0