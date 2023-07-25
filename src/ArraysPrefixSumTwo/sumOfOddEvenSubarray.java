package ArraysPrefixSumTwo;


import java.util.ArrayList;

public class sumOfOddEvenSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,-1,0,8,5,4};
//        int[] nums = {2,4,3,1,5};
        ArrayList<Query> queries = new ArrayList<>();
        queries.add(new Query(3,6,false));
        queries.add(new Query(1,5,true));
        System.out.println("ans: " + sumOfOddEvenSubarray(nums, queries));
    }
    public static int sumOfOddEvenSubarray(int[] nums, ArrayList<Query> queries) {
        int n = nums.length;
        int ans = 0;
        // generate the odd and even PS arrays
        int[] oddPrefixSum = new int[n];
        int[] evenPrefixSum = new int[n];
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                oddSum += nums[i];
            } else {
                evenSum += nums[i];
            }
            oddPrefixSum[i] = oddSum;
            evenPrefixSum[i] = evenSum;
        }
        for (int i = 0 ; i< n; i++){
            System.out.println("i:" + i + " nums[i]:" + nums[i] + " odd:" + oddPrefixSum[i] + " even:" + evenPrefixSum[i]);
        }

        for (Query q : queries) {
            if (q.isEven) {
//                ans += evenPrefixSum[q.r] - evenPrefixSum[q.l];
            } else {
                System.out.println("q.r: " + q.r + " q.l: " + (q.l + 1));
                ans += oddPrefixSum[q.r] - oddPrefixSum[q.l - 2];
            }
        }
        return ans;
    }
    public static class Query {
        int l;
        int r;
        // true == even, false == odd
        boolean isEven;

        public Query(int left, int right, boolean even) {
            l = left;
            r = right;
            isEven = even;
        }
    }
}

//    0  1  2  3  4  5  6  7
//    2  3  1 -1  0  8  5  4
//o:  0  3  3  2  2 10 10 14
//e:  2  2  3  3  3  3  8  8


//3,6,o =>
//    -1 + 8 = 7
//