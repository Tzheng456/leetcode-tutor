package TwoDimentionalArrays;

public class twoDimentionalPrints {
    public static void main(String[] args){
        int[][] mat = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] matB = new int[][] {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };

        int[][] a = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] b = new int[][] {
                {0,1,1},
                {1,0,1},
                {1,1,1}
        };
//        printRowByRow(mat);
//        printSumOfColumns(mat);
//        printSumOfTwoMatrices(mat, matB);
//        printDiagLtoR(mat);
//        printDiagRtoL(0, mat.length - 1, mat);
//        printAllDiagRtoL(mat);
//        printUpperTriangular(mat);
//        transpose(mat);
//        printRowByRow(mat);
//        reversedRows(mat);
//        rotateClockwiseNinetyDegrees(mat);

    }
    public static void printRowByRow(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSumOfColumns(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[j][i];
            }
            System.out.println(sum);
        }
    }

    public static void printSumOfTwoMatrices(int[][] matA, int[][] matB) {
        int[][] newMat = new int[matA.length][matA[0].length];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                newMat[i][j] = matA[i][j] + matB[i][j];
                System.out.println(newMat[i][j]);
            }
        }
    }

    public static void printDiagLtoR(int[][] mat) {
        int i = 0;
        int n = mat.length;
        while (i < n) {
            System.out.println(mat[i][i]);
            i++;
        }
    }

    public static void printDiagRtoL(int si, int sj, int[][] mat) {
        int n = mat.length;
        int i = si;
        int j = sj;
        while (i < n && j >= 0) {
            System.out.print(mat[i++][j--]);
        }
    }

    public static void printAllDiagRtoL(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n - 1; i++) {
            printDiagRtoL(0, i, mat);
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            printDiagRtoL(i, n - 1, mat);
            System.out.println();
        }
    }

    public static void printUpperTriangular(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(mat[i][j]);
            }
        }
    }

    public static int[][] transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                mat[i][j] = mat[i][j] ^ mat[j][i];
                mat[j][i] = mat[i][j] ^ mat[j][i];
                mat[i][j] = mat[i][j] ^ mat[j][i];
            }
        }
//        printRowByRow(mat);
        return mat;
    }

    public static int[][] reversedRows(int[][] mat) {
        int n = mat.length;
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            while (start < end) {
                mat[i][start] = mat[i][start] ^ mat[i][end];
                mat[i][end] = mat[i][start] ^ mat[i][end];
                mat[i][start] = mat[i][start] ^ mat[i][end];
                start++;
                end--;
            }
        }
//        printRowByRow(mat);
        return mat;
    }

    public static int[][] rotateClockwiseNinetyDegrees(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = reversedRows(transpose(mat));
//        printRowByRow(ans);
        return ans;
    }
}

