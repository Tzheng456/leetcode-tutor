package Recursion;

public class Pow {
    public static void main(String[] args) {
//        int a = 2;
//        int b = 8;
//        int c = 10;
        int a = 2;
        int b = 2;
        int c = 5;
        System.out.println(pow(a,b,c));
    }

    public static int pow(int A, int B, int C) {
        // stopping condition is when B is 0, then we return A^0, which is 1;
        if (B == 0) return 1;
        // recursive step:
        return A * pow(A, B - 1, C) % C;
    }
}

// pow(2,2,5);
// return 2 * (pow(2,1,2)) % 5;
// return 2 * (2 * pow(2,0,2))) % 5;
// return 2 * (2 * 1) % 5;
// return 4 % 5;
// return 4;