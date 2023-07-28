package Recursion;

public class IsMagic {
    public static void main(String[] args) {
//        int A = 83557;
        int A = 1291;
        System.out.println(solve(A));
    }
    // very confused if my solution is correct or not...
    // however with these inputs, it is producing the correct output...
    // cannot explain how I got to this answer though (it was just guessing/intuition)
    public static int solve(int A) {
        int curr = sumOfDigits(A);
        if (curr / 10 == 0) return curr == 1 ? 1 : 0;
        return solve(sumOfDigits(curr));
    }

    public static int sumOfDigits(int a) {
        if (a / 10 == 0) return a;
        return sumOfDigits(a / 10) + a % 10;
    }
}
