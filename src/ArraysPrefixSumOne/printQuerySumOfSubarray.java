package ArraysPrefixSumOne;

import java.util.ArrayList;

public class printQuerySumOfSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        ArrayList<Query> queries = new ArrayList<>();
        queries.add(new Query(1,3));
        queries.add(new Query(2,7));
        queries.add(new Query(4,8));
        queries.add(new Query(0,2));

        printQuerySumOfSubarray(nums, queries);
    }
    public static void printQuerySumOfSubarray(int[] nums, ArrayList<Query> queries) {
        int[] prefixSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            prefixSum[i] = sum;
        }
        for (Query query : queries) {
            int start = query.start;
            int end = query.end;
            if (query.start == 0) System.out.println(prefixSum[end]);
            else System.out.println(prefixSum[end] - prefixSum[start - 1]);
        }
    }
    public static class Query {
        int start;
        int end;
        public Query(int s, int e) {
            start = s;
            end = e;
        }
    }
}
