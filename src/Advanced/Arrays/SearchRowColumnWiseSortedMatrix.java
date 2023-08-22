package Advanced.Arrays;

public class SearchRowColumnWiseSortedMatrix {
    public static int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int i = n - 1;
        int j = 0;
        while (i >= 0 && j < m) {
            int curr = A[i][j];
            if (curr == B) return (i+1) * 1009 + (j+1);
            else if (curr > B) i--;
            else j++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(solve(A, 2));
    }

}
