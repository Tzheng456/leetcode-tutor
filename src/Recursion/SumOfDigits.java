package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
//        int a = 46;
        int a = 123;
        System.out.println(sumOfDigits(a));
    }
    public static int sumOfDigits(int a) {
        if (a / 10 == 0) return a;
        return sumOfDigits(a / 10) + a % 10;
    }
}

// int a = 123;
// sumOfDigits(123);
// return sumOfDigits(123/10) + 123%10
// return sumOfDigits(12) + 3;
// return sumOfDigits(12/10) + 12%10 + 3;
// return sumOfDigits(1) + 2 + 3;
// return 1 + 2 + 3;