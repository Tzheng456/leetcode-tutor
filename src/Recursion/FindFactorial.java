package Recursion;

public class FindFactorial {
    public static void main(String[] args) {
        int a = 4;
//        int a = 1;
        System.out.println(fact(a));
    }

    public static int fact(int a) {
        if (a == 0) return 1;
        return a * fact(a-1);
    }
}

// int a = 4;
// fact(4);
// return 4 * fact(3);
// return 4 * (3 * fact(2);
// return 4 * (3 * (2 * fact(1)));
// return 4 * 3 * 2 * 1;
// 24;