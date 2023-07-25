package ArraysPrefixSumOne;

import java.util.ArrayList;

public class fillArrayWithQueryValue {
    public static void main(String[] args) {
        int[] nums = new int[7];
        ArrayList<Query> queries = new ArrayList<>();
        queries.add(new Query(1,3));
        queries.add(new Query(4,2));
        queries.add(new Query(2,1));

        int[] ans = fillArrayWithQueryValue(nums, queries);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
    public static int[] fillArrayWithQueryValue(int[] nums, ArrayList<Query> queries) {
        int n = nums.length;
        int[] arr = new int[n];
        int[] ans = new int[n];

        // build the query array, with value of query at index
        for (Query query : queries) {
            arr[query.idx] += query.val;
        }

        // keep track of the current sum by counting the values from arr (has the query values indexed)
        // assign the value of the current sum to ans at each index...
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans[i] = sum;
        }

        return ans;
    }
    public static class Query {
        int idx;
        int val;
        public Query(int i, int v) {
            idx = i;
            val = v;
        }
    }
}
