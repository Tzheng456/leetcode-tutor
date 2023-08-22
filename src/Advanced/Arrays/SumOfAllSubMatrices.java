package Advanced.Arrays;

public class SumOfAllSubMatrices {
    public static void main(String[] args) {
        int[][] test1 = {
                {1,1},
                {1,1}
        };
        System.out.println(solve(test1));
    }

    public static int solve(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int s = (i + 1) * (j + 1);
                int e = (n - i) * (n - j);
                sum += (s * e) * mat[i][j];
            }
        }
        return sum;
    }
}
