package Advanced.Arrays;

public class PairSumDivisibleByM {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {5,17,100,11};
        System.out.println(solve(A, 2));
        System.out.println(solve(B, 28));
    }

    public static int solve(int[] arr,  int b) {
        // solution incorrect: solved for when b is always 2... oops
        // cannot come up with the intuition for question
            int oddCount = 0, evenCount = 0;
        int n = arr.length;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    // even
                    evenCount++;
                } else {
                    // odd
                    oddCount++;
                }
            }
            int evenPairs = evenCount * (evenCount - 1) / 2;
            int oddPairs = oddCount * (oddCount - 1) / 2;
            int ans = evenPairs + oddPairs;

        return ans % (109 + 7);
    }
}

// (a + b) % m = (a % m + b % m) % m...
//
//2,4,6,8
//
//2,4; 2,6; 2,8; 4,6; 4,8; 6,8 -> 6 pairs
//
//2,4,6
//2,4; 2,6; 4,6; -> 3 pairs
//
//2,4
//2,4; -> 1 pair
//
//n(n-1) / 2 where n is count of even numbers...
//
//1,3,5;
//1,3; 1,5; 3,5; -> 3 pairs
//and... n(n-1) / 2 where n is count of odd numbers...
